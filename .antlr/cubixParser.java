// Generated from /home/maciej/Semestr_VI/Kompilatory/CubixLang/cubix.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cubixParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_algorithmExecution = 2, RULE_show = 3, 
		RULE_loop = 4, RULE_iterationForI = 5, RULE_iterationForEach = 6, RULE_functionExecution = 7, 
		RULE_expression = 8, RULE_cubeInitialization = 9, RULE_algorithmInitalization = 10, 
		RULE_numberInitalization = 11, RULE_settingInitalization = 12, RULE_moveInitalization = 13, 
		RULE_arrayInitalization = 14, RULE_functionDeclaration = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "algorithmExecution", "show", "loop", "iterationForI", 
			"iterationForEach", "functionExecution", "expression", "cubeInitialization", 
			"algorithmInitalization", "numberInitalization", "settingInitalization", 
			"moveInitalization", "arrayInitalization", "functionDeclaration"
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

	@Override
	public String getGrammarFileName() { return "cubix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cubixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cubixParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(cubixParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(cubixParser.SEMICOLON, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(35);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CUBE:
					case MOVE:
					case ALGO:
					case NUM:
					case SETTING:
					case ARRAY:
						{
						setState(32);
						expression();
						}
						break;
					case LOOP:
					case SHOW:
					case VariableName:
						{
						setState(33);
						statement();
						}
						break;
					case FUNC:
						{
						setState(34);
						functionDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHOW) {
				{
				{
				setState(39);
				show();
				setState(40);
				match(SEMICOLON);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(cubixParser.SEMICOLON, 0); }
		public AlgorithmExecutionContext algorithmExecution() {
			return getRuleContext(AlgorithmExecutionContext.class,0);
		}
		public IterationForIContext iterationForI() {
			return getRuleContext(IterationForIContext.class,0);
		}
		public IterationForEachContext iterationForEach() {
			return getRuleContext(IterationForEachContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public FunctionExecutionContext functionExecution() {
			return getRuleContext(FunctionExecutionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(49);
				algorithmExecution();
				}
				break;
			case 2:
				{
				setState(50);
				iterationForI();
				}
				break;
			case 3:
				{
				setState(51);
				iterationForEach();
				}
				break;
			case 4:
				{
				setState(52);
				show();
				}
				break;
			case 5:
				{
				setState(53);
				functionExecution();
				}
				break;
			}
			setState(56);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlgorithmExecutionContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public TerminalNode DOT() { return getToken(cubixParser.DOT, 0); }
		public TerminalNode EXEC() { return getToken(cubixParser.EXEC, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(cubixParser.LeftRoundBracket, 0); }
		public TerminalNode RightRoundBracket() { return getToken(cubixParser.RightRoundBracket, 0); }
		public TerminalNode MOVEVALUE() { return getToken(cubixParser.MOVEVALUE, 0); }
		public TerminalNode COMMA() { return getToken(cubixParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(cubixParser.NUMBER, 0); }
		public AlgorithmExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmExecution; }
	}

	public final AlgorithmExecutionContext algorithmExecution() throws RecognitionException {
		AlgorithmExecutionContext _localctx = new AlgorithmExecutionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algorithmExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VariableName);
			setState(59);
			match(DOT);
			setState(60);
			match(EXEC);
			setState(61);
			match(LeftRoundBracket);
			setState(62);
			_la = _input.LA(1);
			if ( !(_la==MOVEVALUE || _la==VariableName) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(63);
				match(COMMA);
				setState(64);
				match(NUMBER);
				}
			}

			setState(67);
			match(RightRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(cubixParser.SHOW, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(cubixParser.LeftRoundBracket, 0); }
		public TerminalNode RightRoundBracket() { return getToken(cubixParser.RightRoundBracket, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(SHOW);
			setState(70);
			match(LeftRoundBracket);
			{
			setState(71);
			match(VariableName);
			}
			setState(72);
			match(RightRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public IterationForIContext iterationForI() {
			return getRuleContext(IterationForIContext.class,0);
		}
		public IterationForEachContext iterationForEach() {
			return getRuleContext(IterationForEachContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(74);
				iterationForI();
				}
				break;
			case 2:
				{
				setState(75);
				iterationForEach();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationForIContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(cubixParser.LOOP, 0); }
		public TerminalNode TIMES() { return getToken(cubixParser.TIMES, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(cubixParser.LeftCurlyBracket, 0); }
		public TerminalNode RightCurlyBracket() { return getToken(cubixParser.RightCurlyBracket, 0); }
		public TerminalNode NUMBER() { return getToken(cubixParser.NUMBER, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public List<AlgorithmExecutionContext> algorithmExecution() {
			return getRuleContexts(AlgorithmExecutionContext.class);
		}
		public AlgorithmExecutionContext algorithmExecution(int i) {
			return getRuleContext(AlgorithmExecutionContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<CubeInitializationContext> cubeInitialization() {
			return getRuleContexts(CubeInitializationContext.class);
		}
		public CubeInitializationContext cubeInitialization(int i) {
			return getRuleContext(CubeInitializationContext.class,i);
		}
		public List<AlgorithmInitalizationContext> algorithmInitalization() {
			return getRuleContexts(AlgorithmInitalizationContext.class);
		}
		public AlgorithmInitalizationContext algorithmInitalization(int i) {
			return getRuleContext(AlgorithmInitalizationContext.class,i);
		}
		public List<NumberInitalizationContext> numberInitalization() {
			return getRuleContexts(NumberInitalizationContext.class);
		}
		public NumberInitalizationContext numberInitalization(int i) {
			return getRuleContext(NumberInitalizationContext.class,i);
		}
		public List<SettingInitalizationContext> settingInitalization() {
			return getRuleContexts(SettingInitalizationContext.class);
		}
		public SettingInitalizationContext settingInitalization(int i) {
			return getRuleContext(SettingInitalizationContext.class,i);
		}
		public List<MoveInitalizationContext> moveInitalization() {
			return getRuleContexts(MoveInitalizationContext.class);
		}
		public MoveInitalizationContext moveInitalization(int i) {
			return getRuleContext(MoveInitalizationContext.class,i);
		}
		public List<ArrayInitalizationContext> arrayInitalization() {
			return getRuleContexts(ArrayInitalizationContext.class);
		}
		public ArrayInitalizationContext arrayInitalization(int i) {
			return getRuleContext(ArrayInitalizationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(cubixParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(cubixParser.PLUS, i);
		}
		public IterationForIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationForI; }
	}

	public final IterationForIContext iterationForI() throws RecognitionException {
		IterationForIContext _localctx = new IterationForIContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterationForI);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LOOP);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==VariableName || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(TIMES);
			setState(81);
			match(LeftCurlyBracket);
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				{
				setState(82);
				algorithmExecution();
				}
				break;
			case SHOW:
				{
				setState(83);
				show();
				}
				break;
			case LOOP:
				{
				setState(84);
				loop();
				}
				break;
			case CUBE:
				{
				setState(85);
				cubeInitialization();
				}
				break;
			case ALGO:
				{
				setState(86);
				algorithmInitalization();
				}
				break;
			case NUM:
				{
				setState(87);
				numberInitalization();
				}
				break;
			case SETTING:
				{
				setState(88);
				settingInitalization();
				}
				break;
			case MOVE:
				{
				setState(89);
				moveInitalization();
				}
				break;
			case ARRAY:
				{
				setState(90);
				arrayInitalization();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(93);
				match(PLUS);
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VariableName:
					{
					setState(94);
					algorithmExecution();
					}
					break;
				case SHOW:
					{
					setState(95);
					show();
					}
					break;
				case LOOP:
					{
					setState(96);
					loop();
					}
					break;
				case CUBE:
					{
					setState(97);
					cubeInitialization();
					}
					break;
				case ALGO:
					{
					setState(98);
					algorithmInitalization();
					}
					break;
				case NUM:
					{
					setState(99);
					numberInitalization();
					}
					break;
				case SETTING:
					{
					setState(100);
					settingInitalization();
					}
					break;
				case MOVE:
					{
					setState(101);
					moveInitalization();
					}
					break;
				case ARRAY:
					{
					setState(102);
					arrayInitalization();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RightCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationForEachContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(cubixParser.LOOP, 0); }
		public TerminalNode IN() { return getToken(cubixParser.IN, 0); }
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public TerminalNode USING() { return getToken(cubixParser.USING, 0); }
		public TerminalNode LeftCurlyBracket() { return getToken(cubixParser.LeftCurlyBracket, 0); }
		public TerminalNode RightCurlyBracket() { return getToken(cubixParser.RightCurlyBracket, 0); }
		public List<AlgorithmExecutionContext> algorithmExecution() {
			return getRuleContexts(AlgorithmExecutionContext.class);
		}
		public AlgorithmExecutionContext algorithmExecution(int i) {
			return getRuleContext(AlgorithmExecutionContext.class,i);
		}
		public List<ShowContext> show() {
			return getRuleContexts(ShowContext.class);
		}
		public ShowContext show(int i) {
			return getRuleContext(ShowContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<CubeInitializationContext> cubeInitialization() {
			return getRuleContexts(CubeInitializationContext.class);
		}
		public CubeInitializationContext cubeInitialization(int i) {
			return getRuleContext(CubeInitializationContext.class,i);
		}
		public List<AlgorithmInitalizationContext> algorithmInitalization() {
			return getRuleContexts(AlgorithmInitalizationContext.class);
		}
		public AlgorithmInitalizationContext algorithmInitalization(int i) {
			return getRuleContext(AlgorithmInitalizationContext.class,i);
		}
		public List<NumberInitalizationContext> numberInitalization() {
			return getRuleContexts(NumberInitalizationContext.class);
		}
		public NumberInitalizationContext numberInitalization(int i) {
			return getRuleContext(NumberInitalizationContext.class,i);
		}
		public List<SettingInitalizationContext> settingInitalization() {
			return getRuleContexts(SettingInitalizationContext.class);
		}
		public SettingInitalizationContext settingInitalization(int i) {
			return getRuleContext(SettingInitalizationContext.class,i);
		}
		public List<MoveInitalizationContext> moveInitalization() {
			return getRuleContexts(MoveInitalizationContext.class);
		}
		public MoveInitalizationContext moveInitalization(int i) {
			return getRuleContext(MoveInitalizationContext.class,i);
		}
		public List<ArrayInitalizationContext> arrayInitalization() {
			return getRuleContexts(ArrayInitalizationContext.class);
		}
		public ArrayInitalizationContext arrayInitalization(int i) {
			return getRuleContext(ArrayInitalizationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(cubixParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(cubixParser.PLUS, i);
		}
		public IterationForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationForEach; }
	}

	public final IterationForEachContext iterationForEach() throws RecognitionException {
		IterationForEachContext _localctx = new IterationForEachContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_iterationForEach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(LOOP);
			setState(113);
			match(IN);
			setState(114);
			match(VariableName);
			setState(115);
			match(USING);
			setState(116);
			match(VariableName);
			setState(117);
			match(LeftCurlyBracket);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				{
				setState(118);
				algorithmExecution();
				}
				break;
			case SHOW:
				{
				setState(119);
				show();
				}
				break;
			case LOOP:
				{
				setState(120);
				loop();
				}
				break;
			case CUBE:
				{
				setState(121);
				cubeInitialization();
				}
				break;
			case ALGO:
				{
				setState(122);
				algorithmInitalization();
				}
				break;
			case NUM:
				{
				setState(123);
				numberInitalization();
				}
				break;
			case SETTING:
				{
				setState(124);
				settingInitalization();
				}
				break;
			case MOVE:
				{
				setState(125);
				moveInitalization();
				}
				break;
			case ARRAY:
				{
				setState(126);
				arrayInitalization();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(129);
				match(PLUS);
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VariableName:
					{
					setState(130);
					algorithmExecution();
					}
					break;
				case SHOW:
					{
					setState(131);
					show();
					}
					break;
				case LOOP:
					{
					setState(132);
					loop();
					}
					break;
				case CUBE:
					{
					setState(133);
					cubeInitialization();
					}
					break;
				case ALGO:
					{
					setState(134);
					algorithmInitalization();
					}
					break;
				case NUM:
					{
					setState(135);
					numberInitalization();
					}
					break;
				case SETTING:
					{
					setState(136);
					settingInitalization();
					}
					break;
				case MOVE:
					{
					setState(137);
					moveInitalization();
					}
					break;
				case ARRAY:
					{
					setState(138);
					arrayInitalization();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(RightCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExecutionContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cubixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cubixParser.COMMA, i);
		}
		public FunctionExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExecution; }
	}

	public final FunctionExecutionContext functionExecution() throws RecognitionException {
		FunctionExecutionContext _localctx = new FunctionExecutionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionExecution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(VariableName);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(149);
				match(T__0);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						match(VariableName);
						setState(151);
						match(COMMA);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(157);
				match(VariableName);
				setState(158);
				match(T__1);
				}
				}
				break;
			case 2:
				{
				}
				break;
			case 3:
				{
				{
				setState(160);
				match(T__0);
				setState(161);
				match(T__1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(cubixParser.SEMICOLON, 0); }
		public CubeInitializationContext cubeInitialization() {
			return getRuleContext(CubeInitializationContext.class,0);
		}
		public AlgorithmInitalizationContext algorithmInitalization() {
			return getRuleContext(AlgorithmInitalizationContext.class,0);
		}
		public NumberInitalizationContext numberInitalization() {
			return getRuleContext(NumberInitalizationContext.class,0);
		}
		public SettingInitalizationContext settingInitalization() {
			return getRuleContext(SettingInitalizationContext.class,0);
		}
		public MoveInitalizationContext moveInitalization() {
			return getRuleContext(MoveInitalizationContext.class,0);
		}
		public ArrayInitalizationContext arrayInitalization() {
			return getRuleContext(ArrayInitalizationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
				{
				setState(164);
				cubeInitialization();
				}
				break;
			case ALGO:
				{
				setState(165);
				algorithmInitalization();
				}
				break;
			case NUM:
				{
				setState(166);
				numberInitalization();
				}
				break;
			case SETTING:
				{
				setState(167);
				settingInitalization();
				}
				break;
			case MOVE:
				{
				setState(168);
				moveInitalization();
				}
				break;
			case ARRAY:
				{
				setState(169);
				arrayInitalization();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CubeInitializationContext extends ParserRuleContext {
		public TerminalNode CUBE() { return getToken(cubixParser.CUBE, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode CubeValue() { return getToken(cubixParser.CubeValue, 0); }
		public CubeInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cubeInitialization; }
	}

	public final CubeInitializationContext cubeInitialization() throws RecognitionException {
		CubeInitializationContext _localctx = new CubeInitializationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cubeInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(CUBE);
			setState(175);
			match(COLON);
			setState(176);
			match(VariableName);
			setState(177);
			match(ASSIGN);
			setState(178);
			match(CubeValue);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlgorithmInitalizationContext extends ParserRuleContext {
		public TerminalNode ALGO() { return getToken(cubixParser.ALGO, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode AlgorithmValue() { return getToken(cubixParser.AlgorithmValue, 0); }
		public AlgorithmInitalizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmInitalization; }
	}

	public final AlgorithmInitalizationContext algorithmInitalization() throws RecognitionException {
		AlgorithmInitalizationContext _localctx = new AlgorithmInitalizationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_algorithmInitalization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ALGO);
			setState(181);
			match(COLON);
			setState(182);
			match(VariableName);
			setState(183);
			match(ASSIGN);
			setState(184);
			match(AlgorithmValue);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberInitalizationContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(cubixParser.NUM, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(cubixParser.NUMBER, 0); }
		public NumberInitalizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberInitalization; }
	}

	public final NumberInitalizationContext numberInitalization() throws RecognitionException {
		NumberInitalizationContext _localctx = new NumberInitalizationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_numberInitalization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NUM);
			setState(187);
			match(COLON);
			setState(188);
			match(VariableName);
			setState(189);
			match(ASSIGN);
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==VariableName || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingInitalizationContext extends ParserRuleContext {
		public TerminalNode SETTING() { return getToken(cubixParser.SETTING, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode SettingValue() { return getToken(cubixParser.SettingValue, 0); }
		public SettingInitalizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settingInitalization; }
	}

	public final SettingInitalizationContext settingInitalization() throws RecognitionException {
		SettingInitalizationContext _localctx = new SettingInitalizationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_settingInitalization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SETTING);
			setState(193);
			match(COLON);
			setState(194);
			match(VariableName);
			setState(195);
			match(ASSIGN);
			setState(196);
			match(SettingValue);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoveInitalizationContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(cubixParser.MOVE, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode MOVEVALUE() { return getToken(cubixParser.MOVEVALUE, 0); }
		public MoveInitalizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveInitalization; }
	}

	public final MoveInitalizationContext moveInitalization() throws RecognitionException {
		MoveInitalizationContext _localctx = new MoveInitalizationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moveInitalization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(MOVE);
			setState(199);
			match(COLON);
			setState(200);
			match(VariableName);
			setState(201);
			match(ASSIGN);
			setState(202);
			_la = _input.LA(1);
			if ( !(_la==MOVEVALUE || _la==VariableName) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitalizationContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(cubixParser.ARRAY, 0); }
		public TerminalNode LeftRoundBracket() { return getToken(cubixParser.LeftRoundBracket, 0); }
		public TerminalNode Type() { return getToken(cubixParser.Type, 0); }
		public TerminalNode RightRoundBracket() { return getToken(cubixParser.RightRoundBracket, 0); }
		public TerminalNode COLON() { return getToken(cubixParser.COLON, 0); }
		public TerminalNode VariableName() { return getToken(cubixParser.VariableName, 0); }
		public TerminalNode ASSIGN() { return getToken(cubixParser.ASSIGN, 0); }
		public TerminalNode ArrayValue() { return getToken(cubixParser.ArrayValue, 0); }
		public ArrayInitalizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitalization; }
	}

	public final ArrayInitalizationContext arrayInitalization() throws RecognitionException {
		ArrayInitalizationContext _localctx = new ArrayInitalizationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayInitalization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ARRAY);
			setState(205);
			match(LeftRoundBracket);
			setState(206);
			match(Type);
			setState(207);
			match(RightRoundBracket);
			setState(208);
			match(COLON);
			setState(209);
			match(VariableName);
			setState(210);
			match(ASSIGN);
			setState(211);
			match(ArrayValue);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(cubixParser.FUNC, 0); }
		public List<TerminalNode> VariableName() { return getTokens(cubixParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(cubixParser.VariableName, i);
		}
		public TerminalNode BEGIN() { return getToken(cubixParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(cubixParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cubixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cubixParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(FUNC);
			setState(214);
			match(VariableName);
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				{
				setState(215);
				match(T__0);
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						match(VariableName);
						setState(217);
						match(COMMA);
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(223);
				match(VariableName);
				setState(224);
				match(T__1);
				}
				}
				break;
			case 2:
				{
				{
				setState(225);
				match(T__0);
				setState(226);
				match(T__1);
				}
				}
				break;
			}
			setState(229);
			match(BEGIN);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOOP:
				case SHOW:
				case VariableName:
					{
					setState(230);
					statement();
					}
					break;
				case CUBE:
				case MOVE:
				case ALGO:
				case NUM:
				case SETTING:
				case ARRAY:
					{
					setState(231);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CUBE) | (1L << MOVE) | (1L << ALGO) | (1L << NUM) | (1L << SETTING) | (1L << ARRAY) | (1L << LOOP) | (1L << SHOW) | (1L << VariableName))) != 0) );
			setState(236);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00f1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"D\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7j\n\7\7\7l\n\7\f\7\16\7o\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\7\b\u0090\n\b\f\b\16\b\u0093"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00a5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u00dd\n\21\f\21\16\21\u00e0\13\21\3\21\3\21\3\21\3\21\5\21\u00e6"+
		"\n\21\3\21\3\21\3\21\6\21\u00eb\n\21\r\21\16\21\u00ec\3\21\3\21\3\21\2"+
		"\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\4\2\5\5++\4\2++--\2"+
		"\u0118\2%\3\2\2\2\48\3\2\2\2\6<\3\2\2\2\bG\3\2\2\2\nN\3\2\2\2\fP\3\2\2"+
		"\2\16r\3\2\2\2\20\u0096\3\2\2\2\22\u00ac\3\2\2\2\24\u00b0\3\2\2\2\26\u00b6"+
		"\3\2\2\2\30\u00bc\3\2\2\2\32\u00c2\3\2\2\2\34\u00c8\3\2\2\2\36\u00ce\3"+
		"\2\2\2 \u00d7\3\2\2\2\"&\5\22\n\2#&\5\4\3\2$&\5 \21\2%\"\3\2\2\2%#\3\2"+
		"\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(.\3\2\2\2)*\5\b\5\2*+"+
		"\7\26\2\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2"+
		"\2\2\60.\3\2\2\2\61\62\7\2\2\3\62\3\3\2\2\2\639\5\6\4\2\649\5\f\7\2\65"+
		"9\5\16\b\2\669\5\b\5\2\679\5\20\t\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2"+
		"\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:;\7\26\2\2;\5\3\2\2\2<=\7+\2\2=>"+
		"\7\27\2\2>?\7\36\2\2?@\7\17\2\2@C\t\2\2\2AB\7\25\2\2BD\7-\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\7\20\2\2F\7\3\2\2\2GH\7 \2\2HI\7\17\2\2IJ\7+"+
		"\2\2JK\7\20\2\2K\t\3\2\2\2LO\5\f\7\2MO\5\16\b\2NL\3\2\2\2NM\3\2\2\2O\13"+
		"\3\2\2\2PQ\7\34\2\2QR\t\3\2\2RS\7\35\2\2S]\7\23\2\2T^\5\6\4\2U^\5\b\5"+
		"\2V^\5\n\6\2W^\5\24\13\2X^\5\26\f\2Y^\5\30\r\2Z^\5\32\16\2[^\5\34\17\2"+
		"\\^\5\36\20\2]T\3\2\2\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2"+
		"\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^m\3\2\2\2_i\7\31\2\2`j\5\6\4\2aj\5"+
		"\b\5\2bj\5\n\6\2cj\5\24\13\2dj\5\26\f\2ej\5\30\r\2fj\5\32\16\2gj\5\34"+
		"\17\2hj\5\36\20\2i`\3\2\2\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie"+
		"\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3\2\2\2jl\3\2\2\2k_\3\2\2\2lo\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\24\2\2q\r\3\2\2\2rs\7\34\2"+
		"\2st\7#\2\2tu\7+\2\2uv\7$\2\2vw\7+\2\2w\u0081\7\23\2\2x\u0082\5\6\4\2"+
		"y\u0082\5\b\5\2z\u0082\5\n\6\2{\u0082\5\24\13\2|\u0082\5\26\f\2}\u0082"+
		"\5\30\r\2~\u0082\5\32\16\2\177\u0082\5\34\17\2\u0080\u0082\5\36\20\2\u0081"+
		"x\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0081{\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081}\3\2\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0091\3\2\2\2\u0083\u008d\7\31\2\2\u0084\u008e\5\6\4\2\u0085\u008e\5"+
		"\b\5\2\u0086\u008e\5\n\6\2\u0087\u008e\5\24\13\2\u0088\u008e\5\26\f\2"+
		"\u0089\u008e\5\30\r\2\u008a\u008e\5\32\16\2\u008b\u008e\5\34\17\2\u008c"+
		"\u008e\5\36\20\2\u008d\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3"+
		"\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d"+
		"\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0083\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\24"+
		"\2\2\u0095\17\3\2\2\2\u0096\u00a4\7+\2\2\u0097\u009c\7\3\2\2\u0098\u0099"+
		"\7+\2\2\u0099\u009b\7\25\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7+\2\2\u00a0\u00a5\7\4\2\2\u00a1\u00a5\3\2\2\2\u00a2"+
		"\u00a3\7\3\2\2\u00a3\u00a5\7\4\2\2\u00a4\u0097\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\21\3\2\2\2\u00a6\u00ad\5\24\13\2\u00a7"+
		"\u00ad\5\26\f\2\u00a8\u00ad\5\30\r\2\u00a9\u00ad\5\32\16\2\u00aa\u00ad"+
		"\5\34\17\2\u00ab\u00ad\5\36\20\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2"+
		"\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\26\2\2\u00af\23\3\2\2\2\u00b0"+
		"\u00b1\7\7\2\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3\7+\2\2\u00b3\u00b4\7\32"+
		"\2\2\u00b4\u00b5\7\60\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8"+
		"\7\33\2\2\u00b8\u00b9\7+\2\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\7/\2\2\u00bb"+
		"\27\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\7+\2"+
		"\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\t\3\2\2\u00c1\31\3\2\2\2\u00c2\u00c3"+
		"\7\13\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\7+\2\2\u00c5\u00c6\7\32\2\2"+
		"\u00c6\u00c7\7.\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\7"+
		"\33\2\2\u00ca\u00cb\7+\2\2\u00cb\u00cc\7\32\2\2\u00cc\u00cd\t\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d1\7\16"+
		"\2\2\u00d1\u00d2\7\20\2\2\u00d2\u00d3\7\33\2\2\u00d3\u00d4\7+\2\2\u00d4"+
		"\u00d5\7\32\2\2\u00d5\u00d6\7\61\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\7\r"+
		"\2\2\u00d8\u00e5\7+\2\2\u00d9\u00de\7\3\2\2\u00da\u00db\7+\2\2\u00db\u00dd"+
		"\7\25\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\7+\2\2\u00e2\u00e6\7\4\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e6\7\4\2\2\u00e5"+
		"\u00d9\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\7%"+
		"\2\2\u00e8\u00eb\5\4\3\2\u00e9\u00eb\5\22\n\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7&\2\2\u00ef!\3\2\2\2\25%\'.8CN]"+
		"im\u0081\u008d\u0091\u009c\u00a4\u00ac\u00de\u00e5\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}