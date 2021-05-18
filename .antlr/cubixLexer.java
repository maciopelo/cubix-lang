// Generated from /home/maciej/Semestr_VI/Kompilatory/CubixLang/cubix.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cubixLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, MOVEVALUE=3, COLOR=4, CUBE=5, MOVE=6, ALGO=7, NUM=8, SETTING=9, 
		ARRAY=10, FUNC=11, Type=12, LeftRoundBracket=13, RightRoundBracket=14, 
		LeftSquareBracket=15, RightSquareBracket=16, LeftCurlyBracket=17, RightCurlyBracket=18, 
		COMMA=19, SEMICOLON=20, DOT=21, DOLLAR=22, PLUS=23, ASSIGN=24, COLON=25, 
		LOOP=26, TIMES=27, EXEC=28, CUBECONSTRUCTOR=29, SHOW=30, MIXED=31, SOLVED=32, 
		IN=33, USING=34, BEGIN=35, END=36, Whitespace=37, Newline=38, BlockComment=39, 
		LineComment=40, VariableName=41, NONDIGIT=42, NUMBER=43, SettingValue=44, 
		AlgorithmValue=45, CubeValue=46, ArrayValue=47, Wall=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "MOVEVALUE", "COLOR", "CUBE", "MOVE", "ALGO", "NUM", 
			"SETTING", "ARRAY", "FUNC", "Type", "LeftRoundBracket", "RightRoundBracket", 
			"LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", 
			"COMMA", "SEMICOLON", "DOT", "DOLLAR", "PLUS", "ASSIGN", "COLON", "LOOP", 
			"TIMES", "EXEC", "CUBECONSTRUCTOR", "SHOW", "MIXED", "SOLVED", "IN", 
			"USING", "BEGIN", "END", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"VariableName", "NONDIGIT", "NUMBER", "SettingValue", "AlgorithmValue", 
			"CubeValue", "ArrayValue", "Wall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", null, null, "'Cube'", "'Move'", "'Algo'", "'Num'", 
			"'Setting'", "'Array'", "'FUNC'", null, null, null, null, null, null, 
			null, null, "';'", "'.'", "'$'", "'+'", "'='", "':'", "'loop'", "'times'", 
			"'exec'", "'cube'", "'show'", "'\"mixed\"'", "'\"solved\"'", "'in'", 
			"'using'", "'begin'", "'end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "MOVEVALUE", "COLOR", "CUBE", "MOVE", "ALGO", "NUM", 
			"SETTING", "ARRAY", "FUNC", "Type", "LeftRoundBracket", "RightRoundBracket", 
			"LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", 
			"COMMA", "SEMICOLON", "DOT", "DOLLAR", "PLUS", "ASSIGN", "COLON", "LOOP", 
			"TIMES", "EXEC", "CUBECONSTRUCTOR", "SHOW", "MIXED", "SOLVED", "IN", 
			"USING", "BEGIN", "END", "Whitespace", "Newline", "BlockComment", "LineComment", 
			"VariableName", "NONDIGIT", "NUMBER", "SettingValue", "AlgorithmValue", 
			"CubeValue", "ArrayValue", "Wall"
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


	public cubixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cubix.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u022f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a5\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00ac"+
		"\n\5\f\5\16\5\u00af\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00b8\n\5\f\5"+
		"\16\5\u00bb\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c3\n\5\f\5\16\5\u00c6"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00d0\n\5\f\5\16\5\u00d3\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00dc\n\5\f\5\16\5\u00df\13\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00e9\n\5\f\5\16\5\u00ec\13\5\5\5\u00ee"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c\n\r\3\16\3\16"+
		"\3\16\7\16\u0121\n\16\f\16\16\16\u0124\13\16\3\17\3\17\3\17\7\17\u0129"+
		"\n\17\f\17\16\17\u012c\13\17\3\20\3\20\3\20\7\20\u0131\n\20\f\20\16\20"+
		"\u0134\13\20\3\21\3\21\3\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\22"+
		"\3\22\3\22\7\22\u0141\n\22\f\22\16\22\u0144\13\22\3\23\3\23\3\23\7\23"+
		"\u0149\n\23\f\23\16\23\u014c\13\23\3\24\3\24\3\24\7\24\u0151\n\24\f\24"+
		"\16\24\u0154\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\6&\u01a1\n&\r&\16&\u01a2\3"+
		"&\3&\3\'\3\'\5\'\u01a9\n\'\3\'\5\'\u01ac\n\'\3\'\3\'\3(\3(\3(\3(\7(\u01b4"+
		"\n(\f(\16(\u01b7\13(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u01c2\n)\f)\16)\u01c5"+
		"\13)\3)\3)\3*\3*\3*\7*\u01cc\n*\f*\16*\u01cf\13*\3+\5+\u01d2\n+\3,\3,"+
		"\7,\u01d6\n,\f,\16,\u01d9\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\7.\u01f0\n.\f.\16.\u01f3\13.\3.\3.\5.\u01f7\n."+
		"\3.\7.\u01fa\n.\f.\16.\u01fd\13.\3.\3.\3/\3/\3/\3/\3/\5/\u0206\n/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0211\n\60\f\60\16\60\u0214"+
		"\13\60\3\60\3\60\5\60\u0218\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\u01b5\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\b"+
		"\6\2GGOOUUz|\4\2\13\13\"\"\4\2\f\f\17\17\5\2C\\aac|\3\2\63;\3\2\62;\2"+
		"\u0280\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7\u00a4\3\2\2\2\t\u00ed\3\2\2\2\13"+
		"\u00ef\3\2\2\2\r\u00f4\3\2\2\2\17\u00f9\3\2\2\2\21\u00fe\3\2\2\2\23\u0102"+
		"\3\2\2\2\25\u010a\3\2\2\2\27\u0110\3\2\2\2\31\u0115\3\2\2\2\33\u011d\3"+
		"\2\2\2\35\u0125\3\2\2\2\37\u012d\3\2\2\2!\u0135\3\2\2\2#\u013d\3\2\2\2"+
		"%\u0145\3\2\2\2\'\u014d\3\2\2\2)\u0155\3\2\2\2+\u0157\3\2\2\2-\u0159\3"+
		"\2\2\2/\u015b\3\2\2\2\61\u015d\3\2\2\2\63\u015f\3\2\2\2\65\u0161\3\2\2"+
		"\2\67\u0166\3\2\2\29\u016c\3\2\2\2;\u0171\3\2\2\2=\u0176\3\2\2\2?\u017b"+
		"\3\2\2\2A\u0183\3\2\2\2C\u018c\3\2\2\2E\u018f\3\2\2\2G\u0195\3\2\2\2I"+
		"\u019b\3\2\2\2K\u01a0\3\2\2\2M\u01ab\3\2\2\2O\u01af\3\2\2\2Q\u01bd\3\2"+
		"\2\2S\u01c8\3\2\2\2U\u01d1\3\2\2\2W\u01d3\3\2\2\2Y\u01da\3\2\2\2[\u01e8"+
		"\3\2\2\2]\u0200\3\2\2\2_\u0209\3\2\2\2a\u021b\3\2\2\2cd\7>\2\2d\4\3\2"+
		"\2\2ef\7@\2\2f\6\3\2\2\2g\u00a5\7T\2\2hi\7T\2\2i\u00a5\7\64\2\2jk\7T\2"+
		"\2k\u00a5\7r\2\2l\u00a5\7t\2\2mn\7t\2\2n\u00a5\7\64\2\2op\7t\2\2p\u00a5"+
		"\7r\2\2q\u00a5\7N\2\2rs\7N\2\2s\u00a5\7\64\2\2tu\7N\2\2u\u00a5\7r\2\2"+
		"v\u00a5\7n\2\2wx\7n\2\2x\u00a5\7\64\2\2yz\7n\2\2z\u00a5\7r\2\2{\u00a5"+
		"\7H\2\2|}\7H\2\2}\u00a5\7\64\2\2~\177\7H\2\2\177\u00a5\7r\2\2\u0080\u00a5"+
		"\7h\2\2\u0081\u0082\7h\2\2\u0082\u00a5\7\64\2\2\u0083\u0084\7h\2\2\u0084"+
		"\u00a5\7r\2\2\u0085\u00a5\7D\2\2\u0086\u0087\7D\2\2\u0087\u00a5\7\64\2"+
		"\2\u0088\u0089\7D\2\2\u0089\u00a5\7r\2\2\u008a\u00a5\7d\2\2\u008b\u008c"+
		"\7d\2\2\u008c\u00a5\7\64\2\2\u008d\u008e\7d\2\2\u008e\u00a5\7r\2\2\u008f"+
		"\u00a5\7F\2\2\u0090\u0091\7F\2\2\u0091\u00a5\7\64\2\2\u0092\u0093\7F\2"+
		"\2\u0093\u00a5\7r\2\2\u0094\u00a5\7f\2\2\u0095\u0096\7f\2\2\u0096\u00a5"+
		"\7\64\2\2\u0097\u0098\7f\2\2\u0098\u00a5\7r\2\2\u0099\u00a5\7W\2\2\u009a"+
		"\u009b\7W\2\2\u009b\u00a5\7\64\2\2\u009c\u009d\7W\2\2\u009d\u00a5\7r\2"+
		"\2\u009e\u00a5\7w\2\2\u009f\u00a0\7w\2\2\u00a0\u00a5\7\64\2\2\u00a1\u00a2"+
		"\7w\2\2\u00a2\u00a5\7r\2\2\u00a3\u00a5\t\2\2\2\u00a4g\3\2\2\2\u00a4h\3"+
		"\2\2\2\u00a4j\3\2\2\2\u00a4l\3\2\2\2\u00a4m\3\2\2\2\u00a4o\3\2\2\2\u00a4"+
		"q\3\2\2\2\u00a4r\3\2\2\2\u00a4t\3\2\2\2\u00a4v\3\2\2\2\u00a4w\3\2\2\2"+
		"\u00a4y\3\2\2\2\u00a4{\3\2\2\2\u00a4|\3\2\2\2\u00a4~\3\2\2\2\u00a4\u0080"+
		"\3\2\2\2\u00a4\u0081\3\2\2\2\u00a4\u0083\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4"+
		"\u0086\3\2\2\2\u00a4\u0088\3\2\2\2\u00a4\u008a\3\2\2\2\u00a4\u008b\3\2"+
		"\2\2\u00a4\u008d\3\2\2\2\u00a4\u008f\3\2\2\2\u00a4\u0090\3\2\2\2\u00a4"+
		"\u0092\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0097\3\2"+
		"\2\2\u00a4\u0099\3\2\2\2\u00a4\u009a\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\b\3\2\2\2\u00a6\u00a7\7T\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7f\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\5K&\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ee\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7I\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3"+
		"\7g\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b9\3\2\2\2\u00b6"+
		"\u00b8\5K&\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\u00ee\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7D\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c4\3\2\2\2\u00c1\u00c3\5K&\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ee\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c7\u00c8\7[\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7n\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7y\2\2\u00cd\u00d1\3\2\2"+
		"\2\u00ce\u00d0\5K&\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00ee\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7Y\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\5K&\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00ee\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7t\2"+
		"\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00e9\5K&\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00a6\3\2\2\2\u00ed\u00b0\3\2\2\2\u00ed"+
		"\u00bc\3\2\2\2\u00ed\u00c7\3\2\2\2\u00ed\u00d4\3\2\2\2\u00ed\u00e0\3\2"+
		"\2\2\u00ee\n\3\2\2\2\u00ef\u00f0\7E\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2"+
		"\7d\2\2\u00f2\u00f3\7g\2\2\u00f3\f\3\2\2\2\u00f4\u00f5\7O\2\2\u00f5\u00f6"+
		"\7q\2\2\u00f6\u00f7\7x\2\2\u00f7\u00f8\7g\2\2\u00f8\16\3\2\2\2\u00f9\u00fa"+
		"\7C\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\20\3\2\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7o\2\2\u0101"+
		"\22\3\2\2\2\u0102\u0103\7U\2\2\u0103\u0104\7g\2\2\u0104\u0105\7v\2\2\u0105"+
		"\u0106\7v\2\2\u0106\u0107\7k\2\2\u0107\u0108\7p\2\2\u0108\u0109\7i\2\2"+
		"\u0109\24\3\2\2\2\u010a\u010b\7C\2\2\u010b\u010c\7t\2\2\u010c\u010d\7"+
		"t\2\2\u010d\u010e\7c\2\2\u010e\u010f\7{\2\2\u010f\26\3\2\2\2\u0110\u0111"+
		"\7H\2\2\u0111\u0112\7W\2\2\u0112\u0113\7P\2\2\u0113\u0114\7E\2\2\u0114"+
		"\30\3\2\2\2\u0115\u011b\5-\27\2\u0116\u011c\5\13\6\2\u0117\u011c\5\r\7"+
		"\2\u0118\u011c\5\17\b\2\u0119\u011c\5\21\t\2\u011a\u011c\5\23\n\2\u011b"+
		"\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011a\3\2\2\2\u011c\32\3\2\2\2\u011d\u0122\7*\2\2\u011e\u0121"+
		"\5K&\2\u011f\u0121\5M\'\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\34\3\2\2"+
		"\2\u0124\u0122\3\2\2\2\u0125\u012a\7+\2\2\u0126\u0129\5K&\2\u0127\u0129"+
		"\5M\'\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\36\3\2\2\2\u012c\u012a\3\2\2"+
		"\2\u012d\u0132\7]\2\2\u012e\u0131\5K&\2\u012f\u0131\5M\'\2\u0130\u012e"+
		"\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133 \3\2\2\2\u0134\u0132\3\2\2\2\u0135\u013a\7_\2\2\u0136"+
		"\u0139\5K&\2\u0137\u0139\5M\'\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2"+
		"\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\""+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0142\7}\2\2\u013e\u0141\5K&\2\u013f"+
		"\u0141\5M\'\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143$\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u014a\7\177\2\2\u0146\u0149\5K&\2\u0147\u0149\5M\'\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b&\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0152"+
		"\7.\2\2\u014e\u0151\5K&\2\u014f\u0151\5M\'\2\u0150\u014e\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153(\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7=\2\2\u0156*\3\2"+
		"\2\2\u0157\u0158\7\60\2\2\u0158,\3\2\2\2\u0159\u015a\7&\2\2\u015a.\3\2"+
		"\2\2\u015b\u015c\7-\2\2\u015c\60\3\2\2\2\u015d\u015e\7?\2\2\u015e\62\3"+
		"\2\2\2\u015f\u0160\7<\2\2\u0160\64\3\2\2\2\u0161\u0162\7n\2\2\u0162\u0163"+
		"\7q\2\2\u0163\u0164\7q\2\2\u0164\u0165\7r\2\2\u0165\66\3\2\2\2\u0166\u0167"+
		"\7v\2\2\u0167\u0168\7k\2\2\u0168\u0169\7o\2\2\u0169\u016a\7g\2\2\u016a"+
		"\u016b\7u\2\2\u016b8\3\2\2\2\u016c\u016d\7g\2\2\u016d\u016e\7z\2\2\u016e"+
		"\u016f\7g\2\2\u016f\u0170\7e\2\2\u0170:\3\2\2\2\u0171\u0172\7e\2\2\u0172"+
		"\u0173\7w\2\2\u0173\u0174\7d\2\2\u0174\u0175\7g\2\2\u0175<\3\2\2\2\u0176"+
		"\u0177\7u\2\2\u0177\u0178\7j\2\2\u0178\u0179\7q\2\2\u0179\u017a\7y\2\2"+
		"\u017a>\3\2\2\2\u017b\u017c\7$\2\2\u017c\u017d\7o\2\2\u017d\u017e\7k\2"+
		"\2\u017e\u017f\7z\2\2\u017f\u0180\7g\2\2\u0180\u0181\7f\2\2\u0181\u0182"+
		"\7$\2\2\u0182@\3\2\2\2\u0183\u0184\7$\2\2\u0184\u0185\7u\2\2\u0185\u0186"+
		"\7q\2\2\u0186\u0187\7n\2\2\u0187\u0188\7x\2\2\u0188\u0189\7g\2\2\u0189"+
		"\u018a\7f\2\2\u018a\u018b\7$\2\2\u018bB\3\2\2\2\u018c\u018d\7k\2\2\u018d"+
		"\u018e\7p\2\2\u018eD\3\2\2\2\u018f\u0190\7w\2\2\u0190\u0191\7u\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193\u0194\7i\2\2\u0194F\3\2\2\2\u0195"+
		"\u0196\7d\2\2\u0196\u0197\7g\2\2\u0197\u0198\7i\2\2\u0198\u0199\7k\2\2"+
		"\u0199\u019a\7p\2\2\u019aH\3\2\2\2\u019b\u019c\7g\2\2\u019c\u019d\7p\2"+
		"\2\u019d\u019e\7f\2\2\u019eJ\3\2\2\2\u019f\u01a1\t\3\2\2\u01a0\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\b&\2\2\u01a5L\3\2\2\2\u01a6\u01a8\7\17\2\2"+
		"\u01a7\u01a9\7\f\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac"+
		"\3\2\2\2\u01aa\u01ac\7\f\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01ae\b\'\2\2\u01aeN\3\2\2\2\u01af\u01b0\7~\2\2\u01b0"+
		"\u01b1\7B\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7B\2\2\u01b9\u01ba\7~\2"+
		"\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\b(\2\2\u01bcP\3\2\2\2\u01bd\u01be\7"+
		"~\2\2\u01be\u01bf\7~\2\2\u01bf\u01c3\3\2\2\2\u01c0\u01c2\n\4\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\b)\2\2\u01c7"+
		"R\3\2\2\2\u01c8\u01cd\5U+\2\u01c9\u01cc\5U+\2\u01ca\u01cc\5W,\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ceT\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2"+
		"\t\5\2\2\u01d1\u01d0\3\2\2\2\u01d2V\3\2\2\2\u01d3\u01d7\t\6\2\2\u01d4"+
		"\u01d6\t\7\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8X\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db"+
		"\5\37\20\2\u01db\u01dc\5a\61\2\u01dc\u01dd\5\'\24\2\u01dd\u01de\5a\61"+
		"\2\u01de\u01df\5\'\24\2\u01df\u01e0\5a\61\2\u01e0\u01e1\5\'\24\2\u01e1"+
		"\u01e2\5a\61\2\u01e2\u01e3\5\'\24\2\u01e3\u01e4\5a\61\2\u01e4\u01e5\5"+
		"\'\24\2\u01e5\u01e6\5a\61\2\u01e6\u01e7\5!\21\2\u01e7Z\3\2\2\2\u01e8\u01f1"+
		"\5\37\20\2\u01e9\u01ea\5S*\2\u01ea\u01eb\5\'\24\2\u01eb\u01f0\3\2\2\2"+
		"\u01ec\u01ed\5\7\4\2\u01ed\u01ee\5\'\24\2\u01ee\u01f0\3\2\2\2\u01ef\u01e9"+
		"\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\5S"+
		"*\2\u01f5\u01f7\5\7\4\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01fb\3\2\2\2\u01f8\u01fa\5K&\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2"+
		"\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fe\u01ff\5!\21\2\u01ff\\\3\2\2\2\u0200\u0201\5;\36\2\u0201"+
		"\u0205\5\33\16\2\u0202\u0206\5? \2\u0203\u0206\5A!\2\u0204\u0206\5S*\2"+
		"\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0208\5\35\17\2\u0208^\3\2\2\2\u0209\u0212\5\37\20\2\u020a"+
		"\u020b\5S*\2\u020b\u020c\5\'\24\2\u020c\u0211\3\2\2\2\u020d\u020e\5W,"+
		"\2\u020e\u020f\5\'\24\2\u020f\u0211\3\2\2\2\u0210\u020a\3\2\2\2\u0210"+
		"\u020d\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0217\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0218\5S*\2\u0216\u0218"+
		"\5W,\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\5!\21\2\u021a`\3\2\2\2\u021b\u021c\5\t\5\2\u021c\u021d\5\61\31"+
		"\2\u021d\u021e\5#\22\2\u021e\u021f\5\t\5\2\u021f\u0220\5\'\24\2\u0220"+
		"\u0221\5\t\5\2\u0221\u0222\5\'\24\2\u0222\u0223\5\t\5\2\u0223\u0224\5"+
		"\'\24\2\u0224\u0225\5\t\5\2\u0225\u0226\5\'\24\2\u0226\u0227\5\t\5\2\u0227"+
		"\u0228\5\'\24\2\u0228\u0229\5\t\5\2\u0229\u022a\5\'\24\2\u022a\u022b\5"+
		"\t\5\2\u022b\u022c\5\'\24\2\u022c\u022d\5\t\5\2\u022d\u022e\5%\23\2\u022e"+
		"b\3\2\2\2+\2\u00a4\u00ad\u00b9\u00c4\u00d1\u00dd\u00ea\u00ed\u011b\u0120"+
		"\u0122\u0128\u012a\u0130\u0132\u0138\u013a\u0140\u0142\u0148\u014a\u0150"+
		"\u0152\u01a2\u01a8\u01ab\u01b5\u01c3\u01cb\u01cd\u01d1\u01d7\u01ef\u01f1"+
		"\u01f6\u01fb\u0205\u0210\u0212\u0217\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}