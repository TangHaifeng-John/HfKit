package com.haifeng

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {

    void apply(Project project) {
        System.out.println("========================")
        System.out.println("start hf-plug")
        System.out.println("========================")
        project.dependencies{
            debugImplementation 'com.didichuxing.doraemonkit:doraemonkit:1.2.1'
        }

//        project.extensions.create('hf', HFExtension)


//
//        project.afterEvaluate {
//            HFExtension hfExtension = project['hf']
//            System.out.println("--------------->"+hfExtension.enabledDidi)
//            if (hfExtension.enabledDidi){
//
//            }
//
//        }

    }
}