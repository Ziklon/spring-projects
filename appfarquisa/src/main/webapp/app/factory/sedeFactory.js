/**
 * Created by Wilber on 21/12/13.
 */
saleModule.factory('sedeFactory',function($resource){

    var serviceUrl="/appfarquisa/sede/";

    return $resource("",{},{
        'getAll' :{method:'POST',url:serviceUrl+'list'}
    });
});