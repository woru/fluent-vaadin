package com.github.woru.fluentvaadin;

/**
 * Wrapper for expandRatio
 */
public class ExpandRatio {
    private final float expandRatio;

    public ExpandRatio(float expandRatio) {
        this.expandRatio = expandRatio;
    }

    public static ExpandRatio expandRatio(float expandRatio) {
        return new ExpandRatio(expandRatio);
    }

    public float getExpandRatio() {
        return expandRatio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExpandRatio that = (ExpandRatio) o;

        if (Float.compare(that.expandRatio, expandRatio) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (expandRatio != +0.0f ? Float.floatToIntBits(expandRatio) : 0);
    }
}
