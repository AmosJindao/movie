"use strict";

$(function(){
//alert(window.innerWidth);
//alert(document.documentElement.clientWidth);
//alert(document.body.clientWidth);
//
//
//alert(window.innerHeight);
//alert(document.documentElement.clientHeight);
//alert(document.body.clientHeight);
    $("#allTop").css("height","10px");

    var ww = $(document).width();
    var wh = $(document).height();

    var uww = ww -1*2-1*2*2-1*2-1*2 -11;
    var allLeftw = uww * 0.2;
    var allCenterw = uww*0.8;

    $("#allLeft").css("width", allLeftw+"px");
    $("#allCenter").css("width", allCenterw+"px");

    var uwh = wh - 10 - 1*2 - 1*2 - 1*2 - 1*2*2;

    var leftToph = uwh * 0.2;
    var leftBottomh = uwh * 0.8;

    $("#leftTop").css("height", leftToph+"px");
    $("#leftBottom").css("height", leftBottomh+"px");

    var centerToph = uwh * 0.7;
    var centerBottomh = uwh * 0.3;

    $("#centerTop").css("height", centerToph+"px");
    $("#centerBottom").css("height", centerBottomh+"px");

    $("#sqlMenu").css("width","99%");
    $("#sqlMenu").css("height","9%");
    $("#sqlMenu").text("menu here");

    $("#sqlTextarea").css("width", "99%")
    $("#sqlTextarea").css("height", "90%")

    var url = "/schema";
    $.get(url,null,null,"json")
        .done(showSchema)
        .fail(schemaFail)
        .always(schemaComplete);


});

function showSchema(data,textStatus, jqXHR){
    if(data.length > 0){
        var olele = $('<ol>');
        for(var i=0; i<data.length; i++){
            var liele = $('<li>');
            liele.text(data[i].schemaName);
            liele.click(getTables);

            olele.append(liele);
        }
        $("#leftTop").html(olele);
    }else{
         $("#leftTop").html("Nothing here");
    }
}

function schemaFail(jqXHR, textStatus, errorThrown){
    $("#leftTop").text(jqXHR+textStatus+errorThrown);
}

function schemaComplete( jqXHR, textStatus){
   // console.log(jqXHR + "\t" + textStatus )
}

function getTables(){
    var getTableUrl = "";
    var schema = $(this).text();
    getTableUrl = getTableUrl+schema+"/tables";

    $.get(getTableUrl,null,null,"json")
            .done(
                function(data,textStatus, jqXHR){
                    if(data.length > 0){
                        var olele = $('<ol>');
                        for(var i=0; i<data.length; i++){
                            var liele = $('<li>');
                            liele.text(data[i].tableName);

                            liele.click();

                            olele.append(liele);
                        }
                        $("#leftBottom").html(olele);
                    }
                }
            ).fail(
                function schemaFail(jqXHR, textStatus, errorThrown){
                         $("#leftBottom").text(jqXHR+textStatus+errorThrown);
                }
            ).always(
                function( jqXHR, textStatus){
                       // console.log(jqXHR + "\t" + textStatus )
                }
             );
}