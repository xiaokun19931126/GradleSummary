import org.gradle.api.Plugin
import org.gradle.api.Project

class PublishAppPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'hello plugin'
        //创建扩展
        project.extensions.create("publishAppInfo", PublishAppInfoExtension.class)
        //创建任务
        project.tasks.create("publishApp", PublishAppTask.class)

        project.exec()
    }
}