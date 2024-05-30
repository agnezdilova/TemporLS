package su.nsk.iae.tempor.generator;

import org.eclipse.xtext.generator.IGenerator2;
import su.nsk.iae.tempor.tempor.Model;

@SuppressWarnings("all")
public interface ITemporGenerator extends IGenerator2 {
  void setModel(final Model model);

  Output generateRequirements();
}
