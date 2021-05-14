package nl.tjonahen.prototype.elements;

public class Document {

  public Object clone() throws CloneNotSupportedException {
    Document newDocument = new Document();
    newDocument.setHeader((Header) header.clone());
    newDocument.setBody((Body) body.clone());
    newDocument.setFooter((Footer) footer.clone());
    return newDocument;
  }

  private Header header = new Header();
  private Body body = new Body();
  private Footer footer = new Footer();

  public Body getBody() {
    return body;
  }

  public void setBody(Body body) {
    this.body = body;
  }

  public Footer getFooter() {
    return footer;
  }

  public void setFooter(Footer footer) {
    this.footer = footer;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public void print() {
    header.print();
    body.print();
    footer.print();

    // TODO Auto-generated method stub

  }
}
