package tests.annotations.bugreporter;

import tests.annotations.classfinder.ClassFinder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());

	private static final String PACKAGE_TO_SCAN = "tests.annotations.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
        Map<String, List<String>> assigneeBugsMap = new HashMap<>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String assignee = annotation.assignedTo();

                List<String> bugs = assigneeBugsMap.get(assignee);
                if(bugs == null){
                    bugs = new LinkedList<>();
                    assigneeBugsMap.put(assignee,bugs);
                }

                StringBuilder sb = new StringBuilder();

                sb.append("\t").append(REPORTED_BY).append(annotation.reportedBy()).append("\n");
                sb.append("\t").append(CLASS_NAME).append(cl.getName()).append("\n");
                sb.append("\t").append(DESCRIPTION).append(annotation.description()).append("\n");
                sb.append("\t").append(SEVERITY).append(annotation.severity()).append("\n");

				bugs.add(sb.toString());
			}
		}

		StringBuilder sb = new StringBuilder();

        for(Map.Entry<String,List<String>> bugEntry:assigneeBugsMap.entrySet()){
            sb.append(bugEntry.getKey()).append("\n");
            bugEntry.getValue().forEach(bugDescr->sb.append(bugDescr).append("\n"));
        }

        writeToFile(sb.toString(),"output/"+REPORT_NAME);
	}

    private void writeToFile(String content,String filePath) {
        try(FileWriter fw = new FileWriter(new File(filePath));) {
            fw.write(content);
        } catch(IOException e) {
            LOG.severe("IOException attempting to write a file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
