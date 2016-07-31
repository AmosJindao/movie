#!/usr/bin/python
# -*- coding: UTF-8 -*-

"""
databasemysql.py
~~~~~~~~~~~~~

该模块提供爬虫所需的mysql数据库的创建、连接、断开，以及数据的存储功能。
"""

import MySQLdb
from threading import Lock
import traceback

class Database(object):
    def __init__(self):
        try:
            self.conn = MySQLdb.connect(host="localhost",user="root",passwd="data99g2",db="website_crawler",port=3306,charset="utf8")
            cursor = self.conn.cursor()
            cursor.execute('''CREATE TABLE IF NOT EXISTS
                            Webpage (id INTEGER NOT NULL AUTO_INCREMENT , 
                            url TEXT, 
                            pageSource TEXT,
                            keyword TEXT,
                            PRIMARY KEY (id) )''')
            self.lock = Lock()
           # self.conn.commit()
        except Exception, e:
            print traceback.print_exc()
            self.conn = None

    def isConn(self):
        if self.conn:
            return True
        else:
            return False

    def saveData(self, url, pageSource, keyword=''):
        if self.conn:
            self.lock.acquire()
            sql='''INSERT INTO Webpage (url, pageSource, keyword) VALUES (%s, %s, %s);'''
            cursor = self.conn.cursor()
            cursor.execute(sql, (url, pageSource, keyword) )
            self.conn.commit()
            cursor.close()
            self.lock.release()
        else :
            raise MySQLdb.OperationalError,'Database is not connected. Can not save Data!'
        

    def close(self):
        if self.conn:
            self.conn.close()
        else :
            raise MySQLdb.OperationalError, 'Database is not connected.'
