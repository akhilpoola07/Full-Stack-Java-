package DAY7;

public class Addition<T> {
    public T add(T a, T b) {
        if (a instanceof Number && b instanceof Number) {
            if (a instanceof Integer) {
                return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
            } else if (a instanceof Double) {
                return (T) Double.valueOf(((Double) a) + ((Double) b));
            } else if (a instanceof Float) {
                return (T) Float.valueOf(((Float) a) + ((Float) b));
            } else if (a instanceof Long) {
                return (T) Long.valueOf(((Long) a) + ((Long) b));
            } else if (a instanceof Short) {
                return (T) Short.valueOf((short) (((Short) a) + ((Short) b)));
            } else if (a instanceof Byte) {
                return (T) Byte.valueOf((byte) (((Byte) a) + ((Byte) b)));
            }
        } else if (a instanceof String) {
            return (T) ((String) a + (String) b);
        } else if (a instanceof Boolean) {
            return (T) Boolean.valueOf(((Boolean) a) || ((Boolean) b));
        } else if (a instanceof Character) {
            return (T) Character.valueOf((char) (((Character) a) + ((Character) b)));
        }
        return null;
    }
}







