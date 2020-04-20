package com.kodcu.question23;

import java.util.EnumSet;


import static com.kodcu.question23.Style.BOLD;
import static com.kodcu.question23.Style.STRIKETHROUGH;


/**
 * TODO
 * 1 - Can you apply STYLE_BOLD and STYLE_STRIKETHROUGH at the same time ?
 * 2 - What are the alternative options other than working with INTEGERS ?
 */

public class Main {

    public static void main(String[] args) {
        PrintedWork printedWork = new PrintedWork();
        // printedWork.applyStyles(STYLE_BOLD);
        printedWork.applyStyles(EnumSet.of(BOLD, STRIKETHROUGH));

    }
}
