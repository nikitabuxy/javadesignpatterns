package lsp;

/**
 * creating a separate square class violates the LSP. This could be handled by a Factory class ,
 * or by adding a method to check if a rectangle is square or not
 */
public class Square extends Rectangle {

    public Square(){
    }

    public Square(int size) {
        width = height = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
