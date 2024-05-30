package su.nsk.iae.tempor.generator

import org.eclipse.xtext.generator.IGenerator2
import su.nsk.iae.tempor.tempor.Model

interface ITemporGenerator extends IGenerator2 {
	def void setModel(Model model)
	
	def Output generateRequirements()
}