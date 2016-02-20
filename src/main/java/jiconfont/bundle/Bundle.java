package jiconfont.bundle;

import jiconfont.IconCode;
import jiconfont.IconFont;
import jiconfont.icons.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2016 jIconFont <BR>
 * <BR>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:<BR>
 * <BR>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.<BR>
 * <BR>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class Bundle {

    /**
     * Returns all icon fonts from bundle.
     *
     * @return List with the fonts.
     */
    public static List<IconFont> getIconFonts() {
        List<IconFont> list = new ArrayList<>();
        list.add(GoogleMaterialDesignIcons.getIconFont());
        list.add(Elusive.getIconFont());
        list.add(Entypo.getIconFont());
        list.add(FontAwesome.getIconFont());
        list.add(Iconic.getIconFont());
        return list;
    }

    /**
     * Returns all icons from bundle.
     *
     * @return List with the icons.
     */
    public static List<IconCode> getIcons() {
        List<IconCode> list = new ArrayList<>();

        for (IconCode icon : GoogleMaterialDesignIcons.values()) {
            list.add(icon);
        }
        for (IconCode icon : Elusive.values()) {
            list.add(icon);
        }
        for (IconCode icon : Entypo.values()) {
            list.add(icon);
        }
        for (IconCode icon : FontAwesome.values()) {
            list.add(icon);
        }
        for (IconCode icon : Iconic.values()) {
            list.add(icon);
        }

        return list;
    }
}
