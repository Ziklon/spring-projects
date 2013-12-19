/**
 * Created by Wilber on 18/12/13.
 */
var store_var = Ext.create('Ext.data.TreeStore', {
    root: {
        expanded: true,
        children: [
            { text: "detention", leaf: true },
            { text: "homework", expanded: true, children: [
                { text: "book report", leaf: true },
                { text: "algebra", leaf: true}
            ] },
            { text: "buy lottery tickets", leaf: true }
        ]
    }
});

Ext.define("app.view.main.MenuView", {
    extend : 'Ext.tree.Panel',
    alias : 'widgent.MenuView',
    store: store_var,
    rootVisible:false
});
