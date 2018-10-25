package com.example.helloplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diagnostic.Logger;

public class LoggerAction extends AnAction {

    private static final Logger logger = Logger.getInstance(LoggerAction.class);

    @Override
    public void actionPerformed(AnActionEvent e) {
        logger.debug("test debug");
        logger.info("test info");
        logger.warn("test warn");
        logger.error("test error");
    }
}
