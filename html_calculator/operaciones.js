function sumarDatos() {
    var bandera = this.verificarSoloNumeros();
    if (bandera == true){
        var c1 = document.getElementById('numero1').value;
        var c2 = document.getElementById('numero2').value;
        var c3 = (parseInt(c1)) + (parseInt(c2));
        document.getElementById('resultado').value = c3;
        document.getElementById('numero1').value = null;
        document.getElementById('numero2').value = null;
    }
    return false;
}
function restarDatos() {
    var bandera = this.verificarSoloNumeros();
    if (bandera == true) {
        var c1 = document.getElementById('numero1').value;
        var c2 = document.getElementById('numero2').value;
        var c3 = (parseInt(c1)) - (parseInt(c2));
        document.getElementById('resultado').value = c3;
        document.getElementById('numero1').value = null;
        document.getElementById('numero2').value = null;
    }

    return false;
}
function multiplicarDatos() {
    var bandera = this.verificarSoloNumeros();
    if (bandera == true) {
        var c1 = document.getElementById('numero1').value;
        var c2 = document.getElementById('numero2').value;
        var c3 = (parseInt(c1)) * (parseInt(c2));
        document.getElementById('resultado').value = c3;
        document.getElementById('numero1').value = null;
        document.getElementById('numero2').value = null;
    }
    return false;
}
function dividirDatos() {
    var bandera = this.verificarSoloNumeros();
    if (bandera == true) {
        var c1 = document.getElementById('numero1').value;
        var c2 = document.getElementById('numero2').value;
        if (parseInt(c2) == 0){
            alert('No se puede dividir por cero, intentelo de nuevo ^.^')
            document.getElementById('numero2').value = null;
        }else{
            var c3 = (parseInt(c1)) / (parseInt(c2));
            document.getElementById('resultado').value = c3;
            document.getElementById('numero1').value = null;
            document.getElementById('numero2').value = null;
        }
    }
    return false;
}
function verificarSoloNumeros(){

    var c1 = document.getElementById('numero1').value;
    var c2 = document.getElementById('numero2').value;
    var soloNumeros = /^\d*$/;
    var bandera = false;
    if (!c1.search(soloNumeros) & !c2.search(soloNumeros)) {
        this.bandera = true;
    } else {
        alert('valores invalidos introduzca solo número')
        document.getElementById('numero1').value = null;
        document.getElementById('numero2').value = null;
        this.bandera = false;
    }
    return this.bandera;
}