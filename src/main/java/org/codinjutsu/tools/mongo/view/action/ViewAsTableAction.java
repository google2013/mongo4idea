package org.codinjutsu.tools.mongo.view.action;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.codinjutsu.tools.mongo.view.MongoPanel;
import org.codinjutsu.tools.mongo.view.MongoResultPanel;

public class ViewAsTableAction extends AnAction {
    private final MongoPanel mongoPanel;

    public ViewAsTableAction(MongoPanel mongoPanel) {
        super("View as table", "See results as table", AllIcons.Nodes.DataTables);
        this.mongoPanel = mongoPanel;
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        mongoPanel.setViewMode(MongoResultPanel.ViewMode.TABLE);
    }
}
