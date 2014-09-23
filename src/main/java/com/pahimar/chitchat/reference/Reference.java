package com.pahimar.chitchat.reference;

import com.pahimar.chitchat.configuration.Settings;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChitChat
 * <p/>
 * Reference
 *
 * @author pahimar
 * @license GNU Public License v3 (http://www.gnu.org/licenses/gpl.html)
 */
public class Reference
{

    /* General @Mod related constants */
    public static final String MOD_ID = "ChitChat";
    public static final String MOD_NAME = "ChitChat";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String VERSION = "@VERSION@";
    public static final String SERVER_PROXY_CLASS = "com.pahimar.chitchat.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.pahimar.chitchat.proxy.ClientProxy";

    /* Misc constants */
    public static final int MIN_FML_BUILD_NUMBER = 952;
    public static final int TICKS_IN_SECOND = 20;
    public static final int MAX_SECONDS = 86400;

    /* Locations of the blacklists */
    public static final String DEFAULT_BANNED_WORDS_FILE_LOCATION = "/assets/chitchat/bannedwords/default_banned_words.json";
    public static final String BANNED_WORDS_DIRECTORY_LOCATION = Settings.CONFIG_DIRECTORY_PATH + "bannedWords" + File.separator;
    public static final String SIMPLE_BANNED_WORDS_FILE_LOCATION = BANNED_WORDS_DIRECTORY_LOCATION + "simple_banned_words.txt";
    public static final String ADVANCED_BANNED_WORDS_FILE_LOCATION = BANNED_WORDS_DIRECTORY_LOCATION + "advanced_banned_words.json";

    /* Vanilla Minecraft Chat related constants */
    public static final String CHAT_TEXT_MESSAGE_TYPE = "chat.type.text";

    /* Filter mode related constants */
    public static final int FILTER_MODE_NONE = 0;
    public static final int FILTER_MODE_WORD_CENSOR = 1;
    public static final int FILTER_MODE_LINE_CENSOR = 2;
    public static final int FILTER_MODE_HIDE = 3;

    /* Action related constants */
    public static final int ACTION_NOTHING = 0;
    public static final int ACTION_KICK = 1;
    public static final int ACTION_DISABLE_CHAT = 2;
    public static final int ACTION_TIME_OUT = 3;
    public static final int ACTION_BAN = 4;

    /* Equivalent character map for common character substitutions */
    private static Map<String, List<String>> equivalentCharacterMap;

    /**
     * Returns the map of equivalent characters
     *
     * @return A mapping of alphabetical letters and their commonly substituted characters
     */
    public static Map<String, List<String>> getEquivalentCharacterMap()
    {

        if (equivalentCharacterMap == null)
        {
            equivalentCharacterMap = new HashMap<String, List<String>>();
            initEquivalentCharacterMaps();
        }

        return equivalentCharacterMap;
    }

    /**
     * Initializes the equivalent character map, mapping common letter substitutions to letters of the alphabet
     */
    private static void initEquivalentCharacterMaps()
    {
        Reference.equivalentCharacterMap.put("a", Arrays.asList("@", "4", "æ", "à", "á", "â", "â", "ã", "ä", "å", "À", "Á", "Â", "Ã", "Ä", "Å", "Æ", "ª"));
        Reference.equivalentCharacterMap.put("b", Arrays.asList("8", "ß", "Þ", "þ"));
        Reference.equivalentCharacterMap.put("c", Arrays.asList("ç", "Ç", "©", "¢", "Œ"));
        Reference.equivalentCharacterMap.put("d", Arrays.asList("Ð"));
        Reference.equivalentCharacterMap.put("e", Arrays.asList("3", "æ", "è", "é", "ê", "ë", "€", "È", "É", "Ê", "Ë", "Æ", "Œ", "œ"));
        Reference.equivalentCharacterMap.put("f", Arrays.asList("ƒ"));
        Reference.equivalentCharacterMap.put("g", null);
        Reference.equivalentCharacterMap.put("h", null);
        Reference.equivalentCharacterMap.put("i", Arrays.asList("!", "l", "1", "ì", "í", "î", "ï", "Ì", "Í", "Î", "Ï", "¡"));
        Reference.equivalentCharacterMap.put("j", null);
        Reference.equivalentCharacterMap.put("k", null);
        Reference.equivalentCharacterMap.put("l", Arrays.asList("1", "£"));
        Reference.equivalentCharacterMap.put("m", null);
        Reference.equivalentCharacterMap.put("n", Arrays.asList("ñ", "Ñ"));
        Reference.equivalentCharacterMap.put("o", Arrays.asList("0", "ð", "ò", "ó", "ô", "õ", "ö", "ø", "Ò", "Ó", "Ô", "Õ", "Ö", "Ø", "œ"));
        Reference.equivalentCharacterMap.put("p", Arrays.asList("Þ", "þ"));
        Reference.equivalentCharacterMap.put("q", null);
        Reference.equivalentCharacterMap.put("r", Arrays.asList("®"));
        Reference.equivalentCharacterMap.put("s", Arrays.asList("5", "$", "z", "Š", "š", "§"));
        Reference.equivalentCharacterMap.put("t", Arrays.asList("+", "7", "†"));
        Reference.equivalentCharacterMap.put("u", Arrays.asList("ù", "ú", "û", "ü", "Ù", "Ú", "Û", "Ü"));
        Reference.equivalentCharacterMap.put("v", null);
        Reference.equivalentCharacterMap.put("w", null);
        Reference.equivalentCharacterMap.put("x", Arrays.asList("×"));
        Reference.equivalentCharacterMap.put("y", Arrays.asList("ý", "ÿ", "Ý", "¥", "Ÿ"));
        Reference.equivalentCharacterMap.put("z", Arrays.asList("2", "s", "Ž", "ž"));
    }
}
