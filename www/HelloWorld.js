var HelloWorld = {
    sayHello: function(name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, 'HelloWorld', 'sayHello', [name]);
    }
};

module.exports = HelloWorld;
