package org.gradle.sample.report;

import org.gradle.api.file.FileCollection
import org.gradle.api.tasks.TaskAction
import org.gradle.api.DefaultTask

public class ReportTask extends DefaultTask {

    private final static String DASHED_LINE = "\n----------------------------------\n\n"

    def FileCollection jars

    @TaskAction def createReport() {
        def text = new StringBuilder()
        ["os.name", "os.version", "java.version", "java.vm.version", "java.runtime.version", "user.language", "user.name"].each {
                text.append(it + ":\t${System.getProperty(it)}\n")
         }

        text.append("gradle -v".execute().text)

        text.append(DASHED_LINE)

        text.append("Dependencies:\n")
  
        jars.each {
                text.append("\t- $it.name\t${it.length()}\n")
        }
        println "GENERATING REPORT"
        
        new File('build').mkdir()
	def reportFile = new File('build/report.txt')
        if (reportFile.exists()) {
        	new File('build/report.txt').delete()
        }
        reportFile << text
    }
}

