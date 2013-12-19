Ext.define("app.view.main.MainView",{
    extend:'Ext.container.Viewport',
    alias: 'widgent.MainView',
    layout: 'border',
    items: [{
        id: 'north',
        region: 'north',
        layout : 'hbox',
        height: 38,
        items:[{
            flex: 1,
            baseCls: '',
            id:'north-left',
            html:'JUNTOS'
        },{
            flex: 1,
            baseCls: '',
            id:'north-center',
            html:'Usuario: USUARIO'
        },{
            flex: 1,
            id:'north-right',
            baseCls: ''//,
            //html:'<a href="'+CONTEXT_PATH+'/mvc/login/logout">Cerrar Sesi&#243;n</>'
        }]
    }, {
        region: 'west',
        collapsible: true,
        split:true,
        title: 'M&#243;dulos',
        width: 180,
        iconCls:'icon-modules',
        items: Ext.create("app.view.main.MenuView")
    }, {
        region: 'center',
        xtype: 'tabpanel', // TabPanel itself has no title
        activeTab: 0,      // First tab active by default
        //layout:'fit',
        items: {
            iconCls: 'icon-home',
            title: 'Principal',
            html:'<h1>Hello World</h1>'

        }
    }]
});

