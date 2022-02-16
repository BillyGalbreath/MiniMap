package net.pl3x.minimap.util;

public class Mathf {
    public static final float PI = (float) Math.PI;
    public static final float SQRT_OF_2 = Mathf.sqrt(2F);

    public static float cosRads(float degree) {
        return (float) Math.cos(Math.toRadians(degree));
    }

    public static float sinRads(float degree) {
        return (float) Math.sin(Math.toRadians(degree));
    }

    public static float cos(float value) {
        return (float) Math.cos(value);
    }

    public static float pow(float value, float power) {
        return (float) Math.pow(value, power);
    }

    public static float sin(float value) {
        return (float) Math.sin(value);
    }

    public static float sqrt(float value) {
        return (float) Math.sqrt(value);
    }

    public static float lerp(float a, float b, float t) {
        return a + t * (b - a);
    }

    public static float inverseLerp(float a, float b, float t) {
        return (t - a) / (b - a);
    }

    public static float clamp(float min, float max, float value) {
        return Math.max(Math.min(value, max), min);
    }
}