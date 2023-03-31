let map
let marker = []



function initMap() {
    console.log("INICIO MAPA")
    const posicion = {
        lat: -25.363,
        lng:131.044
    } 

    const map = new google.maps.Map(document.getElementById("map"), {
        zoom: 4,
        center: posicion
    })

    
    const oslo = newMarker()
    /*addMarker ( "Oslo", 59.90893186736404, 10.684174256108076 )
    const alemania = addMarker ( "Alemania", 54.02271144014345, 9.381668177154813 )
    const finlandia = addMarker ( "Finlandia", 62.02509420571354, 25.69453336229307 )
    const noruega = addMarker ( "Noruega", 48.97495051840249, 31.879165403133474 )    */

    
    /**
 * Funcion que solicita los paramatros: titulo, altitud y longitud.
 * 
 * Esto añade un marcador a tu mapa
 */

function newMarker() {
    new google.maps.Marker({
        position: {
            lat: 59.90893186736404,
            lng: 10.684174256108076
        },
        map,
        title: "OSLO"})
}

function addMarker(titulo, latitude, longitude) {
        new google.maps.Marker({
            position: {
                lat: latitude,
                lng: longitude
            },
            map,
            title: titulo
        })

}

console.log(JSON.stringify(oslo))
    
    //obtener la geolocalizacion
    //marker.setPosition({ lat, lang})
    
    function geoPosicion() {
        if (navigator.geolocation) {
            const geoLoc = navigator.geolocation
            const options = {timeout: 60000}
            const watchPos = geoLoc.watchPosition(centraMapa, onError, options)
        } else {
            alert("Tu navegador no cuenta con geolocalizacion")
        }
    }
    
}


function centraMapa(position) {
    const nuevaPos = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
    }
    console.log(nuevaPos)
    marker.setPosition(nuevaPos)
    map.setCenter(nuevaPos)
}

function onError(error) {
    console.log(error)
}