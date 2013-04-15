/*
 * http://techasite.blogspot.fr/
 * @author asic
 */

print("begin javascript");


print("instanciate Java ArrayList from javascript");
var x = new java.util.ArrayList(4);
    x.add('Java');
    x.add('JavaScript');
    x.add('SQL');
    x.add('XML');
print("element #3 of list : " + x[2]);


print("create a json");
var myjson = {
	"firstname":"stephane",
	"blog":"http://techasite.blogspot.fr/",
	"entries": [
		{"title":"Des outils magiques en ligne saison 6","url":"http://techasite.blogspot.fr/2013/03/des-outils-magiques-en-ligne-saison-6.html"},
		{"title":"2ème partie l'architecture en détail d'une Single page web app HTML5 webstorage, offline et Angularjs","url":"http://techasite.blogspot.fr/2013/03/2eme-partie-larchitecture-en-detail.html"},
		{"title":"1ere partie génération d'une Single page web app HTML5 webstorage, offline et Angularjs","url":"http://techasite.blogspot.fr/2013/02/1ere-partie-g-d-page-web-app-html5.html"}
	]
};
print("the title of entry #1 : " + myjson.entries[1].title);


print("show in javascript the var add in engine context from java : " + java_var_in);


var js_var_out = "out";
print("from javascript, add a new var in engine context js_var_out : " + js_var_out);


var myfct= function(paramIn) {
	print("executing function javascript");
	return "I don't like " + paramIn;
};


print("end javascript");

