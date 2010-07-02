package org.gradle.sample.ui.swing;

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL

public class SwingApp {

public static void main(String[] args) {
def swing = new SwingBuilder()
def frame = swing.frame(title:'Frame', size:[500,500]) {
  borderLayout()
  def textlabel = label(text:'<html><div style="text-align: center; font-size: 140%;">Click the button!</div></html>', constraints: BL.CENTER)
  button(text:'<html><span style="font-size: 130%;">Click Me</span></html>',
         actionPerformed: {
	    textlabel.text = '<html><div style="text-align: center; font-size: 140%;">A simple Swing app<br/>written with Groovy<br/> just to present<br>how Gradle can handle it.</div></html>'
	  },
         constraints:BL.SOUTH)
}
frame.show()
}
}
