package tests.annotations.javapackage;

import tests.annotations.bugreporter.BugReport;

@BugReport(assignedTo="Tom Jones", severity=1, reportedBy="Corazza")
public interface ClosedCurve {
	public double computePerimeter();
}
