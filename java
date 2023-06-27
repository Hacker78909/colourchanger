function changeColor(button) {
  var body = document.getElementsByTagName("body")[0];

  // Get the button's color and text
  var color = button.style.backgroundColor;
  var text = button.innerHTML;

  // Change the background color and button color to their opposites
  body.style.backgroundColor = getOppositeColor(color);
  button.style.backgroundColor = getOppositeColor(color);
  button.style.color = color;

  // Change the button text to the original color
  button.innerHTML = color;

  // Delay resetting the button text after 1 second
  setTimeout(function() {
    button.innerHTML = text;
  }, 1000);
}

function getOppositeColor(color) {
  // Assuming color is in RGB format
  var rgb = color.slice(4, -1).split(", ");
  var r = 255 - parseInt(rgb[0]);
  var g = 255 - parseInt(rgb[1]);
  var b = 255 - parseInt(rgb[2]);

  return "rgb(" + r + ", " + g + ", " + b + ")";
}
