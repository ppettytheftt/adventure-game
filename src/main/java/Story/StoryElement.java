package Story;

public class StoryElement {
    String elementType;
    boolean willBreakStory;

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public boolean willBreakStory() {
        return willBreakStory;
    }

    public void setWillBreakStory(boolean willBreakStory) {
        this.willBreakStory = willBreakStory;
    }
}
