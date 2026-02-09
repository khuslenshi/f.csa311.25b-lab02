Shape rect = new Rectangle(10,5);

Renderer renderer = new Renderer();
renderer.draw(rect);
// Main нь тодорхой дүрс (Rectangle) доторх мэдээллээс хамаарахгүй,
// зөвхөн Shape interface ашиглан Renderer-д дамжуулж байна.
