package com.unicom.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiUtil {
    /**
     * 过滤表情<br>
     * @param source
     * @return
     */
    public static String filterEmoji(String source) {
        if(source != null)
        {
            Pattern emoji = Pattern.compile ("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]|[\ue000-\uf8ff]",Pattern.UNICODE_CASE | Pattern . CASE_INSENSITIVE );
            Matcher emojiMatcher = emoji.matcher(source);
            if ( emojiMatcher.find())
            {
                source = emojiMatcher.replaceAll("");
                return source;
            }
            return source;
        }
        return source;
    }
}
