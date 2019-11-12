var Connection = require('tedious').Connection;
var config = {
    server: 'mineservidor.database.windows.net',  //update me
    authentication: {
        type: 'default',
        options: {
            userName: 'minehash', //update me
            password: 'Bandtec@2019'  //update me
        }
    },
    options: {
        // If you are on Microsoft Azure, you need encryption:
        encrypt: true,
        database: 'mineHash'  //update me
    }
};
var connection = new Connection(config);
connection.on('connect', function (err) {
    // If no error, then good to proceed.
    console.log("Connected");
    executeStatement();
});

var Request = require('tedious').Request;
var TYPES = require('tedious').TYPES;

function executeStatement() {
    request = new Request("select * from Minerador;", function (err) {
        if (err) {
            console.log(err);
        }
    });
    var result = "";
    request.on('row', function (columns) {
        columns.forEach(function (column) {
            if (column.value === null) {
                console.log('NULL');
            } else {
                result += column.value + " ";
            }
        });
        console.log(result);
        result = "";
    });

    request.on('done', function (rowCount, more) {
        console.log(rowCount + ' rows returned');
    });
    connection.execSql(request);
}


