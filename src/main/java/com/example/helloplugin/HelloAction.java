package com.example.helloplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

// AnAction はイベントハンドラクラスでプラグインの処理は AnAction を継承したクラスで実装する
public class HelloAction extends AnAction {

    // actionPerformed はイベントハンドラメソッドで例えばメニューから項目を選択した際などに発火する
    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "Hello world!", "Greeting", Messages.getInformationIcon());
    }
}
