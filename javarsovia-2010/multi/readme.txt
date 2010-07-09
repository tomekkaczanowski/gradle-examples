This code was prepared by Tomek Kaczanowski for Javarsovia 2010 Gradle talk. It works fine with gradle-0.9-preview-3.
You can use it freely.

For more details visit http://kaczanowscy.pl/tomek

Run the following commands:

tree -L 3 -d
cat settings.gradle

gradle clean
gradle build

cd ui/swing
gradle build
gradle build -a
gradle buildNeeded

cd PROJECT_ROOT
gradle ui:swing:build

cd core
gradle build
gradle buildDependents
