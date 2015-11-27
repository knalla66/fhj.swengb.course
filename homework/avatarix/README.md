# AVATARIX

This application is a GUI which shows the whole group members of the IMA14.
The GUI shows all group members with their profile picture from GitHub.
"On Click" the profile picture and the GUI provides additional information about the person.

The Main Program makes a request to the WebService and parse the information via Json into the main program back.
the parsed information will be provided in the GUI, which is made via the Scenebuilder.


The Group Members for this project:

GUI-Design:         Amar Bajric, Verena Skerbinz, Christian Lagger
Parser & List:      Stefan Leitner, Daniel Kandlhofer, Georg Meizenitsch
Tests:              Steven Hysi, Wolfgang Steinkellner, Granit Hoxha
Documentation:      Markus Knaller
Presentation:       Amar Bajric

*** Change Notes ***
1)  Julia Johansson and Elke Keck got removed from the group "GUI-Design"
2)  The Point "List" got merged with "Parser"
3)  The responsible persons for "List" got divided
            Christian Lagger to "GUI Design"
            Georg Meizenitsch to "Parser"



## GUI-DESIGN ##
Responsible Person: Amar Bajric, Verena Skerbinz, Christian Lagger

Needs to know the fields which get parsed (from the parser team)
The GUI is a dynamic GUI.
The GUI is created with a borderpane, in the borderpane is a splitpane on the left side for the pictures
and the left side for the details.

avatarix.scala
First we get the whole map about the students and save it as a map in the variable loadData.
For each User in the map the application iterates over it and creates for every person the pictures and Data.

There is an mouseEventHandler for OnClick (MouseClick) to load the detail data for the specified user and display
it in the GUI.
The second mouseEventHandler (effect) will make Shadows for every picture.

Detailed description are in the file.


## PARSER ##
Responsible Person: Stefan Leitner, Daniel Kandlhofer, Georg Meizenitsch

For the parserFunction was created an own Object for better merging and better GUI logic.

ParserFunctions.scala
Stefan has registered the APP by GIT Hub and got a Client & Security ID 
Wird beim Aufruf der API aufgeruft damit man mehr Zugriffe hat. (Sonst kommt Error 403)

Webservice Path:    https://api.github.com/users/$githubUsername
Selected Parameters to parse:
    gitHubname
  "login": "knalla66",
  "avatar_url": "https://avatars.githubusercontent.com/u/15108257?v=3",
  "html_url": "https://github.com/knalla66",
  "followers_url": "https://api.github.com/users/knalla66/followers", (not in the GUI)
  "following_url": "https://api.github.com/users/knalla66/following{/other_user}", (not in the GUI)
  "followers": 0,
  "following": 1,

with the function "getData" was a map created with all the parsing Data explained above.
The key for each entry in the map is the specific gitHubUserName.

The test vals (test1, test2) are only used static because of the 403 problem.
With the registration of the app by GIT Hub, the problem was solved and the test vals would not be used anymore.

Detailed description are in the file.

## Tests ##
Responsible Person: Steven Hysi, Wolfgang Steinkellner, Granit Hoxha











