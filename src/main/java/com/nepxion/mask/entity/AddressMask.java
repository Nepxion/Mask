package com.nepxion.mask.entity;

/**
 * <p>Title: Nepxion Mask</p>
 * <p>Description: Nepxion Mask</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.util.regex.Pattern;

import com.nepxion.mask.util.MaskUtil;

public class AddressMask extends Mask {
    private static final long serialVersionUID = -1217392503430570321L;

    private final Pattern PATTERN = Pattern.compile("[0-9一二三四五六七八九十百千万]++|[A-Za-z]+(?=\\s*[座区])");
    private final String mask = new String(MaskUtil.MASK_3);

    private static AddressMask instance = new AddressMask();

    public static AddressMask instance() {
        return instance;
    }

    private AddressMask() {
        super(0, 0, 0);
    }

    @Override
    protected char[] internalMask(String text) {
        return PATTERN.matcher(text).replaceAll(mask).toCharArray();
    }
}