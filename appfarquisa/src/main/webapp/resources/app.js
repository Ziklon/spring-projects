/**
 * Created by Wilber on 18/12/13.
 */

Ext.Loader.setConfig({
    enabled:true
});




Ext.application({
    requires: ['Ext.container.Viewport'],
    name: 'app',

    appFolder: 'app',

    launch: function() {
        Ext.create('app.view.main.MainView', {

        });
    }
});
