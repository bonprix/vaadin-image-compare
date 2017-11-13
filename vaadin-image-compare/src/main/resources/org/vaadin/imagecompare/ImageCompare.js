window.org_vaadin_imagecompare_ImageCompare = function () {

  var elem = this.getElement(), self = this
  var timeout

  this.onStateChange = function () {

    var state = this.getState()

    console.log('onStateChange', state, elem)

    var container = document.createElement('div')
    elem.appendChild(container)

    var left = document.createElement('img')
    left.setAttribute('src', state.left)
    container.appendChild(left)

    var right = document.createElement('img')
    right.setAttribute('src', state.right)
    container.appendChild(right)

    new ImageComparison({
      container: container,
      startPosition: 50,
      data: [
        {
          image: left,
          label: state.leftLabel
        },
        {
          image: right,
          label: state.rightLabel
        }
      ],
    })

  }

}