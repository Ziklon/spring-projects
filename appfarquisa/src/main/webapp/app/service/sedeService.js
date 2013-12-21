/**
 * Created by Wilber on 21/12/13.
 */

saleModule.service('sedeService', function () {
    this.getAll = function () {
        return sedes;
    }
    var sedes = [
        {"sedeId": 1, "descripcion": "descripcion 1", "direccion": "direccion 1"},
        {"sedeId": 2, "descripcion": "descripcion 1", "direccion": "direccion 1"},
        {"sedeId": 3, "descripcion": "descripcion 1", "direccion": "direccion 1"},
        {"sedeId": 4, "descripcion": "descripcion 0", "direccion": "direccion 0"},
        {"sedeId": 5, "descripcion": "descripcion 0", "direccion": "direccion 0"},
        {"sedeId": 6, "descripcion": "descripcion 1", "direccion": "direccion 1"},
        {"sedeId": 7, "descripcion": "descripcion 2", "direccion": "direccion 2"},
        {"sedeId": 8, "descripcion": "descripcion 3", "direccion": "direccion 3"},
        {"sedeId": 9, "descripcion": "descripcion 4", "direccion": "direccion 4"},
        {"sedeId": 10, "descripcion": "descripcion 5", "direccion": "direccion 5"}
    ];
});

