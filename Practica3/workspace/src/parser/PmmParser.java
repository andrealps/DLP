// Generated from C:/Users/UO264703/Desktop/DLP/DLP/Practica3/workspace/src/parser\Pmm.g4 by ANTLR 4.8
package parser;

    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WHITESPACE=37, COMMENT=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, CHAR_CONSTANT=41, ID=42;
	public static final int
		RULE_program = 0, RULE_vardef = 1, RULE_primitiveType = 2, RULE_funcdef = 3, 
		RULE_params = 4, RULE_param = 5, RULE_statement = 6, RULE_expr = 7, RULE_function_invocation = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "vardef", "primitiveType", "funcdef", "params", "param", "statement", 
			"expr", "function_invocation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'struct'", "'{'", "'}'", "'['", "']'", "'int'", 
			"'char'", "'double'", "'def'", "'('", "')'", "'return'", "'while'", "'if'", 
			"'else'", "'print'", "'input'", "'='", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WHITESPACE", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"ID"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(18);
					vardef();
					}
					break;
				case T__11:
					{
					setState(19);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 || _la==ID );
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

	public static class VardefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(PmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(PmmParser.INT_CONSTANT, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vardef);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(ID);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(25);
					match(T__0);
					setState(26);
					match(ID);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(T__1);
				setState(33);
				primitiveType();
				setState(34);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(ID);
				setState(37);
				match(T__1);
				setState(38);
				match(T__3);
				setState(39);
				match(T__4);
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(40);
					param();
					setState(41);
					match(T__2);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(47);
				match(T__5);
				setState(48);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__1);
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					match(T__6);
					setState(53);
					match(INT_CONSTANT);
					setState(54);
					match(T__7);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(59);
				primitiveType();
				setState(60);
				match(T__2);
				}
				break;
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__11);
			setState(67);
			match(ID);
			setState(68);
			match(T__12);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(69);
				params();
				}
			}

			setState(72);
			match(T__13);
			setState(73);
			match(T__1);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(74);
				primitiveType();
				}
			}

			setState(77);
			match(T__4);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					vardef();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__5);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			param();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(93);
				match(T__0);
				setState(94);
				param();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(T__1);
			setState(102);
			primitiveType();
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
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				function_invocation();
				setState(105);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__14);
				setState(108);
				expr(0);
				setState(109);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__15);
				setState(112);
				expr(0);
				setState(113);
				match(T__1);
				setState(114);
				match(T__4);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(115);
					statement();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__16);
				setState(124);
				expr(0);
				setState(125);
				match(T__1);
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__22:
				case T__23:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					setState(126);
					statement();
					}
					break;
				case T__4:
					{
					setState(127);
					match(T__4);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(128);
						statement();
						}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(134);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__17);
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__19:
				case T__22:
				case T__23:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case ID:
					{
					setState(138);
					statement();
					}
					break;
				case T__4:
					{
					setState(139);
					match(T__4);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
						{
						{
						setState(140);
						statement();
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(146);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(T__18);
				setState(150);
				expr(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(151);
					match(T__0);
					setState(152);
					expr(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(T__19);
				setState(161);
				expr(0);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(162);
					match(T__0);
					setState(163);
					expr(0);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				expr(0);
				setState(172);
				match(T__20);
				setState(173);
				expr(0);
				setState(174);
				match(T__2);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(179);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(180);
				match(REAL_CONSTANT);
				}
				break;
			case 3:
				{
				setState(181);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(182);
				match(ID);
				}
				break;
			case 5:
				{
				setState(183);
				match(T__12);
				setState(184);
				expr(0);
				setState(185);
				match(T__13);
				}
				break;
			case 6:
				{
				setState(187);
				match(T__12);
				setState(188);
				primitiveType();
				setState(189);
				match(T__13);
				setState(190);
				expr(8);
				}
				break;
			case 7:
				{
				setState(192);
				match(T__22);
				setState(193);
				expr(7);
				}
				break;
			case 8:
				{
				setState(194);
				match(T__23);
				setState(195);
				expr(6);
				}
				break;
			case 9:
				{
				setState(196);
				function_invocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(212);
						match(T__6);
						setState(213);
						expr(0);
						setState(214);
						match(T__7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(217);
						match(T__21);
						setState(218);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_invocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_invocationContext function_invocation() throws RecognitionException {
		Function_invocationContext _localctx = new Function_invocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(225);
			match(T__12);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__23) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(226);
				expr(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(227);
					match(T__0);
					setState(228);
					expr(0);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(236);
			match(T__13);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3.\n\3\r\3\16\3/\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\3\5\3A\n\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\7\5R\n\5\f\5\16\5U"+
		"\13\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\7\6b\n\6\f\6\16"+
		"\6e\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n"+
		"\b\f\b\16\b\u0087\13\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b"+
		"\f\b\16\b\u0093\13\b\3\b\5\b\u0096\n\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f"+
		"\b\16\b\u009f\13\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa"+
		"\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c8\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\t\u00de\n\t\f\t\16\t\u00e1\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u00e8"+
		"\n\n\f\n\16\n\u00eb\13\n\5\n\u00ed\n\n\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n"+
		"\f\16\20\22\2\7\3\2\13\r\3\2\33\35\4\2\31\31\36\36\3\2\37$\3\2%&\2\u0110"+
		"\2\26\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bD\3\2\2\2\n^\3\2\2\2\ff\3\2\2\2\16"+
		"\u00b2\3\2\2\2\20\u00c7\3\2\2\2\22\u00e2\3\2\2\2\24\27\5\4\3\2\25\27\5"+
		"\b\5\2\26\24\3\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\3\3\2\2\2\32\37\7,\2\2\33\34\7\3\2\2\34\36\7,\2\2\35\33\3\2"+
		"\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7"+
		"\4\2\2#$\5\6\4\2$%\7\5\2\2%A\3\2\2\2&\'\7,\2\2\'(\7\4\2\2()\7\6\2\2)-"+
		"\7\7\2\2*+\5\f\7\2+,\7\5\2\2,.\3\2\2\2-*\3\2\2\2./\3\2\2\2/-\3\2\2\2/"+
		"\60\3\2\2\2\60\61\3\2\2\2\61\62\7\b\2\2\62\63\7\5\2\2\63A\3\2\2\2\64\65"+
		"\7,\2\2\659\7\4\2\2\66\67\7\t\2\2\678\7)\2\28:\7\n\2\29\66\3\2\2\2:;\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\6\4\2>?\7\5\2\2?A\3\2\2\2@\32"+
		"\3\2\2\2@&\3\2\2\2@\64\3\2\2\2A\5\3\2\2\2BC\t\2\2\2C\7\3\2\2\2DE\7\16"+
		"\2\2EF\7,\2\2FH\7\17\2\2GI\5\n\6\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\20"+
		"\2\2KM\7\4\2\2LN\5\6\4\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OS\7\7\2\2PR\5\4"+
		"\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\16"+
		"\b\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\b\2\2]\t\3\2\2\2^c\5\f\7\2_`\7\3\2\2`b\5\f\7\2a_\3\2\2\2be\3\2\2\2ca"+
		"\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ec\3\2\2\2fg\7,\2\2gh\7\4\2\2hi\5\6\4\2"+
		"i\r\3\2\2\2jk\5\22\n\2kl\7\5\2\2l\u00b3\3\2\2\2mn\7\21\2\2no\5\20\t\2"+
		"op\7\5\2\2p\u00b3\3\2\2\2qr\7\22\2\2rs\5\20\t\2st\7\4\2\2tx\7\7\2\2uw"+
		"\5\16\b\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2"+
		"{|\7\b\2\2|\u00b3\3\2\2\2}~\7\23\2\2~\177\5\20\t\2\177\u0089\7\4\2\2\u0080"+
		"\u008a\5\16\b\2\u0081\u0085\7\7\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\b\2\2\u0089\u0080\3\2"+
		"\2\2\u0089\u0081\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0095\7\24\2\2\u008c"+
		"\u0096\5\16\b\2\u008d\u0091\7\7\2\2\u008e\u0090\5\16\b\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\b\2\2\u0095\u008c\3\2"+
		"\2\2\u0095\u008d\3\2\2\2\u0096\u00b3\3\2\2\2\u0097\u0098\7\25\2\2\u0098"+
		"\u009d\5\20\t\2\u0099\u009a\7\3\2\2\u009a\u009c\5\20\t\2\u009b\u0099\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00b3\3\2"+
		"\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a8\5\20\t\2\u00a4\u00a5\7\3\2\2\u00a5"+
		"\u00a7\5\20\t\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\5\2\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\7"+
		"\27\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7\5\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"j\3\2\2\2\u00b2m\3\2\2\2\u00b2q\3\2\2\2\u00b2}\3\2\2\2\u00b2\u0097\3\2"+
		"\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5"+
		"\b\t\1\2\u00b5\u00c8\7)\2\2\u00b6\u00c8\7*\2\2\u00b7\u00c8\7+\2\2\u00b8"+
		"\u00c8\7,\2\2\u00b9\u00ba\7\17\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\7"+
		"\20\2\2\u00bc\u00c8\3\2\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\5\6\4\2\u00bf"+
		"\u00c0\7\20\2\2\u00c0\u00c1\5\20\t\n\u00c1\u00c8\3\2\2\2\u00c2\u00c3\7"+
		"\31\2\2\u00c3\u00c8\5\20\t\t\u00c4\u00c5\7\32\2\2\u00c5\u00c8\5\20\t\b"+
		"\u00c6\u00c8\5\22\n\2\u00c7\u00b4\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c7\u00b7"+
		"\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7"+
		"\u00c2\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00df\3\2"+
		"\2\2\u00c9\u00ca\f\7\2\2\u00ca\u00cb\t\3\2\2\u00cb\u00de\5\20\t\b\u00cc"+
		"\u00cd\f\6\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00de\5\20\t\7\u00cf\u00d0\f"+
		"\5\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00de\5\20\t\6\u00d2\u00d3\f\4\2\2\u00d3"+
		"\u00d4\t\6\2\2\u00d4\u00de\5\20\t\5\u00d5\u00d6\f\f\2\2\u00d6\u00d7\7"+
		"\t\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\7\n\2\2\u00d9\u00de\3\2\2\2\u00da"+
		"\u00db\f\13\2\2\u00db\u00dc\7\30\2\2\u00dc\u00de\7,\2\2\u00dd\u00c9\3"+
		"\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00d2\3\2\2\2\u00dd"+
		"\u00d5\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\21\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3"+
		"\7,\2\2\u00e3\u00ec\7\17\2\2\u00e4\u00e9\5\20\t\2\u00e5\u00e6\7\3\2\2"+
		"\u00e6\u00e8\5\20\t\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00e4\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\20"+
		"\2\2\u00ef\23\3\2\2\2\32\26\30\37/;@HMSYcx\u0085\u0089\u0091\u0095\u009d"+
		"\u00a8\u00b2\u00c7\u00dd\u00df\u00e9\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}