// $(selector).accion()

//$("h1").hide()

/*$(document).ready(() => {

})*/

$(document).ready(() => {
    // Selectores:
    // id="el-1" => "#el-1"
    // class = "el-1" => ".el-1"
    // $("#el-1").hide()

    $(".hide-btn").click(() => {
        console.log("ocultar")
        $("h1").fadeOut()
    })

    $(".show-btn").click(() => {
        console.log("mostrar")
        $("h1").fadeIn()
    }) 

    $("li").click(() => {
        $("h1").css({color: "red"})
    })

    $("li").dblclick(() => {
        $("h1").css({color: "blue"})
    })

    $(".new-element").click(() => {
        $("ul").append("<li>NuevoElemento</li>")
    })

    $("li").mouseenter((elem) => {
        elem.target.style.color = "blue"
    })

    $("li").mouseleave((elem) => {
        elem.target.style.color = "black"
    })

})