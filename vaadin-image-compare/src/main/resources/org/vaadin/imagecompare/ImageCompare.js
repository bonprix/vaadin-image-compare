window.org_vaadin_imagecompare_ImageCompare = function () {

  var elem = this.getElement(), container, self = this
  var imgX, imgY

  var recalculate = function () {
    var x = elem.offsetWidth
    var y = elem.offsetHeight

    var rX = imgX / x
    var rY = imgY / y

    if (rX > rY) {
      container.style.height = Math.round(imgY * (x / imgX)) + 'px'
      container.style.width = x + 'px'
    } else {
      container.style.height = y + 'px'
      container.style.width = Math.round(imgX * (y / imgY)) + 'px'
    }
    console.log('recalculated', rX, rY, container.style.width, container.style.height)
  }

  this.onStateChange = function () {

    var state = this.getState()

    while (elem.hasChildNodes()) {
      elem.removeChild(elem.lastChild)
    }

    var left = new Image()
    left.src = state.left.url
    left.onload = function () {
      imgX = this.width
      imgY = this.height

      container = document.createElement('div')
      elem.appendChild(container)
      recalculate()

      left.classList.add('comparison-image')
      container.appendChild(left)

      var right = new Image()
      right.src = state.right.url
      right.classList.add('comparison-image')
      container.appendChild(right)

      new ImageComparison({
        container: container,
        startPosition: 50,
        data: [
          {
            image: left,
            label: state.left.label
          },
          {
            image: right,
            label: state.right.label
          }
        ],
      })

      return true
    }

  }

}