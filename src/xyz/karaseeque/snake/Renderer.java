package xyz.karaseeque.snake;

public class Renderer {
    public String render (World world) {
        String result = "";
        int height = world.getHeight(), width = world.getWidth();

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                String cell;
                switch (world.getCellAt(row, col)) {
                    case FOOD:
                        cell = "@";
                        break;
                    case WALL:
                        cell = "#";
                        break;
                    case HEAD:
                        cell = "O";
                        break;
                    case TAIL:
                        cell = "o";
                        break;
                    case EMPTY: default:
                        cell = " ";
                        break;
                }
                result += cell;
            }

            result += "\n";
        }

        return result;
    }
}