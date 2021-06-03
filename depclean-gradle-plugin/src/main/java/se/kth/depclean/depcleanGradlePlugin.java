package se.kth.depclean;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;

public class depcleanGradlePlugin implements Plugin<Project> {

    String taskName = "debloat";

    @Override
    public void apply(Project project) {


        depcleanGradleTask task = createTask(project);
//        project.getTasks().getByName(JavaPlugin.COMPILE_JAVA_TASK_NAME).dependsOn(task);

    }

    public depcleanGradleTask createTask(Project project) {
        depcleanGradleTask task = project.getTasks().create(taskName, depcleanGradleTask.class);
        task.setGroup("group");
        task.setDescription("Print outcome.");
        return task;
    }
}