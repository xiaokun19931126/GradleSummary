import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PublishAppTask extends DefaultTask {

    PublishAppTask() {
        group = "xiaokun"
        dependsOn "build"
    }

    @TaskAction
    void doAction() {

    }

}