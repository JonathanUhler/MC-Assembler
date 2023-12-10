// Generated from ./src/grammar/MCMicroprocessor8Bit.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MCMicroprocessor8BitLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_UINT8=1, T_BOOL=2, S_BOOLEAN=3, S_TRUE=4, S_FALSE=5, KW_FUNC=6, KW_IF=7, 
		KW_ELIF=8, KW_ELSE=9, KW_FOR=10, KW_WHILE=11, KW_CONTINUE=12, KW_BREAK=13, 
		BI_EXIT=14, BI_FREE=15, P_REASSIGN=16, P_BBINARY=17, P_BUNARY=18, P_LBINARY=19, 
		P_LUNARY=20, P_PLUS=21, P_MINUS=22, P_EQ=23, P_ASSIGN=24, P_LOR=25, P_BOR=26, 
		P_LAND=27, P_BAND=28, P_NEQ=29, P_LNOT=30, P_BNOT=31, P_LPAR=32, P_RPAR=33, 
		P_LBRACE=34, P_RBRACE=35, P_SEMICOLON=36, ID_NAME=37, ID_INTEGER=38, ID_DIGIT=39, 
		ID_POS_DIGIT=40, ID_LETTER=41, ID_COMMENT=42, ID_WS=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_UINT8", "T_BOOL", "S_BOOLEAN", "S_TRUE", "S_FALSE", "KW_FUNC", "KW_IF", 
			"KW_ELIF", "KW_ELSE", "KW_FOR", "KW_WHILE", "KW_CONTINUE", "KW_BREAK", 
			"BI_EXIT", "BI_FREE", "P_REASSIGN", "P_BBINARY", "P_BUNARY", "P_LBINARY", 
			"P_LUNARY", "P_PLUS", "P_MINUS", "P_EQ", "P_ASSIGN", "P_LOR", "P_BOR", 
			"P_LAND", "P_BAND", "P_NEQ", "P_LNOT", "P_BNOT", "P_LPAR", "P_RPAR", 
			"P_LBRACE", "P_RBRACE", "P_SEMICOLON", "ID_NAME", "ID_INTEGER", "ID_DIGIT", 
			"ID_POS_DIGIT", "ID_LETTER", "ID_COMMENT", "ID_WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'uint8'", "'bool'", null, "'true'", "'false'", "'func'", "'if'", 
			"'elif'", "'else'", "'for'", "'while'", "'continue'", "'break'", "'exit'", 
			"'free'", null, null, null, null, null, "'+'", "'-'", "'=='", "'='", 
			"'||'", "'|'", "'&&'", "'&'", "'!='", "'!'", "'~'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_UINT8", "T_BOOL", "S_BOOLEAN", "S_TRUE", "S_FALSE", "KW_FUNC", 
			"KW_IF", "KW_ELIF", "KW_ELSE", "KW_FOR", "KW_WHILE", "KW_CONTINUE", "KW_BREAK", 
			"BI_EXIT", "BI_FREE", "P_REASSIGN", "P_BBINARY", "P_BUNARY", "P_LBINARY", 
			"P_LUNARY", "P_PLUS", "P_MINUS", "P_EQ", "P_ASSIGN", "P_LOR", "P_BOR", 
			"P_LAND", "P_BAND", "P_NEQ", "P_LNOT", "P_BNOT", "P_LPAR", "P_RPAR", 
			"P_LBRACE", "P_RBRACE", "P_SEMICOLON", "ID_NAME", "ID_INTEGER", "ID_DIGIT", 
			"ID_POS_DIGIT", "ID_LETTER", "ID_COMMENT", "ID_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MCMicroprocessor8BitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MCMicroprocessor8Bit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000+\u0112\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0003\u0002e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00ab\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00bb\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0003$\u00e5\b$\u0001$\u0001$\u0001$\u0005$\u00ea\b$\n"+
		"$\f$\u00ed\t$\u0001%\u0001%\u0001%\u0005%\u00f2\b%\n%\f%\u00f5\t%\u0003"+
		"%\u00f7\b%\u0001&\u0001&\u0003&\u00fb\b&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0005)\u0105\b)\n)\f)\u0108\t)\u0001)\u0001"+
		")\u0001*\u0004*\u010d\b*\u000b*\f*\u010e\u0001*\u0001*\u0000\u0000+\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)S*U+\u0001\u0000\u0004\u0001\u000019\u0002\u0000AZaz\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  \u0124\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000"+
		"\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000"+
		"I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001"+
		"\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000"+
		"\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0001"+
		"W\u0001\u0000\u0000\u0000\u0003]\u0001\u0000\u0000\u0000\u0005d\u0001"+
		"\u0000\u0000\u0000\u0007f\u0001\u0000\u0000\u0000\tk\u0001\u0000\u0000"+
		"\u0000\u000bq\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000\u000f"+
		"y\u0001\u0000\u0000\u0000\u0011~\u0001\u0000\u0000\u0000\u0013\u0083\u0001"+
		"\u0000\u0000\u0000\u0015\u0087\u0001\u0000\u0000\u0000\u0017\u008d\u0001"+
		"\u0000\u0000\u0000\u0019\u0096\u0001\u0000\u0000\u0000\u001b\u009c\u0001"+
		"\u0000\u0000\u0000\u001d\u00a1\u0001\u0000\u0000\u0000\u001f\u00aa\u0001"+
		"\u0000\u0000\u0000!\u00b2\u0001\u0000\u0000\u0000#\u00b4\u0001\u0000\u0000"+
		"\u0000%\u00ba\u0001\u0000\u0000\u0000\'\u00bc\u0001\u0000\u0000\u0000"+
		")\u00be\u0001\u0000\u0000\u0000+\u00c0\u0001\u0000\u0000\u0000-\u00c2"+
		"\u0001\u0000\u0000\u0000/\u00c5\u0001\u0000\u0000\u00001\u00c7\u0001\u0000"+
		"\u0000\u00003\u00ca\u0001\u0000\u0000\u00005\u00cc\u0001\u0000\u0000\u0000"+
		"7\u00cf\u0001\u0000\u0000\u00009\u00d1\u0001\u0000\u0000\u0000;\u00d4"+
		"\u0001\u0000\u0000\u0000=\u00d6\u0001\u0000\u0000\u0000?\u00d8\u0001\u0000"+
		"\u0000\u0000A\u00da\u0001\u0000\u0000\u0000C\u00dc\u0001\u0000\u0000\u0000"+
		"E\u00de\u0001\u0000\u0000\u0000G\u00e0\u0001\u0000\u0000\u0000I\u00e4"+
		"\u0001\u0000\u0000\u0000K\u00f6\u0001\u0000\u0000\u0000M\u00fa\u0001\u0000"+
		"\u0000\u0000O\u00fc\u0001\u0000\u0000\u0000Q\u00fe\u0001\u0000\u0000\u0000"+
		"S\u0100\u0001\u0000\u0000\u0000U\u010c\u0001\u0000\u0000\u0000WX\u0005"+
		"u\u0000\u0000XY\u0005i\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005t\u0000"+
		"\u0000[\\\u00058\u0000\u0000\\\u0002\u0001\u0000\u0000\u0000]^\u0005b"+
		"\u0000\u0000^_\u0005o\u0000\u0000_`\u0005o\u0000\u0000`a\u0005l\u0000"+
		"\u0000a\u0004\u0001\u0000\u0000\u0000be\u0003\u0007\u0003\u0000ce\u0003"+
		"\t\u0004\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u0006"+
		"\u0001\u0000\u0000\u0000fg\u0005t\u0000\u0000gh\u0005r\u0000\u0000hi\u0005"+
		"u\u0000\u0000ij\u0005e\u0000\u0000j\b\u0001\u0000\u0000\u0000kl\u0005"+
		"f\u0000\u0000lm\u0005a\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000"+
		"\u0000op\u0005e\u0000\u0000p\n\u0001\u0000\u0000\u0000qr\u0005f\u0000"+
		"\u0000rs\u0005u\u0000\u0000st\u0005n\u0000\u0000tu\u0005c\u0000\u0000"+
		"u\f\u0001\u0000\u0000\u0000vw\u0005i\u0000\u0000wx\u0005f\u0000\u0000"+
		"x\u000e\u0001\u0000\u0000\u0000yz\u0005e\u0000\u0000z{\u0005l\u0000\u0000"+
		"{|\u0005i\u0000\u0000|}\u0005f\u0000\u0000}\u0010\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005e\u0000\u0000\u007f\u0080\u0005l\u0000\u0000\u0080\u0081"+
		"\u0005s\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0012\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005f\u0000\u0000\u0084\u0085\u0005o\u0000\u0000"+
		"\u0085\u0086\u0005r\u0000\u0000\u0086\u0014\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005w\u0000\u0000\u0088\u0089\u0005h\u0000\u0000\u0089\u008a\u0005"+
		"i\u0000\u0000\u008a\u008b\u0005l\u0000\u0000\u008b\u008c\u0005e\u0000"+
		"\u0000\u008c\u0016\u0001\u0000\u0000\u0000\u008d\u008e\u0005c\u0000\u0000"+
		"\u008e\u008f\u0005o\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090\u0091"+
		"\u0005t\u0000\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005n"+
		"\u0000\u0000\u0093\u0094\u0005u\u0000\u0000\u0094\u0095\u0005e\u0000\u0000"+
		"\u0095\u0018\u0001\u0000\u0000\u0000\u0096\u0097\u0005b\u0000\u0000\u0097"+
		"\u0098\u0005r\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u009a\u0005"+
		"a\u0000\u0000\u009a\u009b\u0005k\u0000\u0000\u009b\u001a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005e\u0000\u0000\u009d\u009e\u0005x\u0000\u0000\u009e"+
		"\u009f\u0005i\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\u001c\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005f\u0000\u0000\u00a2\u00a3\u0005r\u0000"+
		"\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5"+
		"\u001e\u0001\u0000\u0000\u0000\u00a6\u00ab\u0003)\u0014\u0000\u00a7\u00ab"+
		"\u0003+\u0015\u0000\u00a8\u00ab\u00033\u0019\u0000\u00a9\u00ab\u00037"+
		"\u001b\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003/\u0017"+
		"\u0000\u00ad \u0001\u0000\u0000\u0000\u00ae\u00b3\u0003)\u0014\u0000\u00af"+
		"\u00b3\u0003+\u0015\u0000\u00b0\u00b3\u00033\u0019\u0000\u00b1\u00b3\u0003"+
		"7\u001b\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003=\u001e"+
		"\u0000\u00b5$\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003-\u0016\u0000\u00b7"+
		"\u00bb\u00031\u0018\u0000\u00b8\u00bb\u00035\u001a\u0000\u00b9\u00bb\u0003"+
		"9\u001c\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb&\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003;\u001d\u0000"+
		"\u00bd(\u0001\u0000\u0000\u0000\u00be\u00bf\u0005+\u0000\u0000\u00bf*"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005-\u0000\u0000\u00c1,\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c3\u00c4\u0005=\u0000\u0000"+
		"\u00c4.\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c60"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005|\u0000\u0000\u00c8\u00c9\u0005"+
		"|\u0000\u0000\u00c92\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005|\u0000"+
		"\u0000\u00cb4\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005&\u0000\u0000\u00cd"+
		"\u00ce\u0005&\u0000\u0000\u00ce6\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"&\u0000\u0000\u00d08\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005!\u0000"+
		"\u0000\u00d2\u00d3\u0005=\u0000\u0000\u00d3:\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005!\u0000\u0000\u00d5<\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"~\u0000\u0000\u00d7>\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005(\u0000"+
		"\u0000\u00d9@\u0001\u0000\u0000\u0000\u00da\u00db\u0005)\u0000\u0000\u00db"+
		"B\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005{\u0000\u0000\u00ddD\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005}\u0000\u0000\u00dfF\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0005;\u0000\u0000\u00e1H\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e5\u0003Q(\u0000\u00e3\u00e5\u0005_\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00eb\u0001"+
		"\u0000\u0000\u0000\u00e6\u00ea\u0003Q(\u0000\u00e7\u00ea\u0003M&\u0000"+
		"\u00e8\u00ea\u0005_\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ecJ\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f7\u0003M&\u0000\u00ef\u00f3\u0003O"+
		"\'\u0000\u00f0\u00f2\u0003M&\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f6\u00ef\u0001\u0000\u0000\u0000\u00f7L\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fb\u00050\u0000\u0000\u00f9\u00fb\u0003O\'\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fbN\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0007\u0000\u0000\u0000\u00fdP\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0007\u0001\u0000\u0000\u00ffR\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005/\u0000\u0000\u0101\u0102\u0005/\u0000\u0000\u0102\u0106"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\b\u0002\u0000\u0000\u0104\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0006"+
		")\u0000\u0000\u010aT\u0001\u0000\u0000\u0000\u010b\u010d\u0007\u0003\u0000"+
		"\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0006*\u0000\u0000"+
		"\u0111V\u0001\u0000\u0000\u0000\r\u0000d\u00aa\u00b2\u00ba\u00e4\u00e9"+
		"\u00eb\u00f3\u00f6\u00fa\u0106\u010e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}