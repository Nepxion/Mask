package com.nepxion.mask.core;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.Arrays;

import com.nepxion.banner.BannerConstant;
import com.nepxion.banner.Description;
import com.nepxion.banner.LogoBanner;
import com.nepxion.banner.NepxionBanner;
import com.nepxion.mask.constant.MaskConstant;
import com.taobao.text.Color;

public final class Mask {
    public static final char MASK_CHAR = '*';
    public static final char[] MASK_3 = new char[3];
    public static final char[] MASK_4 = new char[4];
    public static final char[] MASK_6 = new char[6];
    public static final char[] MASK_100 = new char[100];
    public static final char[] EMPTY_CHARS = new char[0];

    static {
        /*String bannerShown = System.getProperty(BannerConstant.BANNER_SHOWN, "true");
        if (Boolean.valueOf(bannerShown)) {
            System.out.println("");
            System.out.println("╔═╗╔═╗     ╔╗");
            System.out.println("║║╚╝║║     ║║");
            System.out.println("║╔╗╔╗╠══╦══╣║╔╗");
            System.out.println("║║║║║║╔╗║══╣╚╝╝");
            System.out.println("║║║║║║╔╗╠══║╔╗╗");
            System.out.println("╚╝╚╝╚╩╝╚╩══╩╝╚╝");
            System.out.println("Nepxion Mask  v" + MaskConstant.MASK_VERSION);
            System.out.println("");
        }*/

        LogoBanner logoBanner = new LogoBanner(Mask.class, "/com/nepxion/mask/resource/logo.txt", "Welcome to Nepxion", 4, 5, new Color[] { Color.red, Color.green, Color.cyan, Color.blue }, true);

        NepxionBanner.show(logoBanner, new Description(BannerConstant.VERSION + ":", MaskConstant.MASK_VERSION, 0, 1), new Description(BannerConstant.GITHUB + ":", BannerConstant.NEPXION_GITHUB + "/Mask", 0, 1));
    }

    static {
        Arrays.fill(MASK_3, MASK_CHAR);
        Arrays.fill(MASK_4, MASK_CHAR);
        Arrays.fill(MASK_6, MASK_CHAR);
        Arrays.fill(MASK_100, MASK_CHAR);
    }

    private Mask() {

    }

    /**
     * 掩码处理工具，保留指定数量的字符，其他字符以 "*" 替代。
     * @param text 原文字符串
     * @param before 原文中头部需要保留的字符数量
     * @param after 原文中尾部需要保留的字符数量
     * @return 掩码处理后的字符串。如果原文字符串长度小于等于头部与尾部保留的字符数量之和时，不作掩码处理
     */
    public static String mask(String text, int before, int after) {
        char[] chars = maskToChars(text, before, after);

        return toString(chars);
    }

    public static String mask(String text, int before, int after, int maskCount) {
        char[] chars = maskToChars(text, before, after, maskCount);

        return toString(chars);
    }

    public static char[] maskToChars(String text, int before, int after) {
        if (text == null) {
            return null;
        }

        char[] charArray = text.toCharArray();
        if (charArray.length == 0 || charArray.length <= before + after) {
            return charArray;
        }

        System.arraycopy(MASK_100, before, charArray, before, charArray.length - before - after);

        return charArray;
    }

    public static char[] maskToChars(String text, int before, int after, int maskCount) {
        if (text == null) {
            return null;
        }

        if (maskCount <= 0) {
            return maskToChars(text, before, after);
        }

        char[] charArray = text.toCharArray();
        if (charArray.length == 0 || charArray.length <= before + after) {
            return charArray;
        }

        if (maskCount > MASK_100.length) {
            maskCount = MASK_100.length;
        }

        char[] chars = new char[before + after + maskCount];

        System.arraycopy(charArray, 0, chars, 0, before);
        System.arraycopy(charArray, charArray.length - after, chars, chars.length - after, after);
        System.arraycopy(MASK_100, 0, chars, before, maskCount);

        return chars;
    }

    private static String toString(char[] chars) {
        if (chars == null) {
            return null;
        }

        return new String(chars);
    }
}