// Generated from D:/UNIVERSIDAD/Tercer curso/DLP/Laboratorio/DLP/workspace/src/parser\Pmm.g4 by ANTLR 4.8
package parser;

    import ast.*;
    import errorhandler.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, WHITESPACE=38, 
		COMMENT=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, ID=43;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_vardef = 2, RULE_primitiveType = 3, 
		RULE_type = 4, RULE_funcdef = 5, RULE_listVariable = 6, RULE_params = 7, 
		RULE_param = 8, RULE_ids = 9, RULE_statement = 10, RULE_cuerpoIter = 11, 
		RULE_cuerpoFunc = 12, RULE_statements = 13, RULE_expr = 14, RULE_function_invocation = 15, 
		RULE_expressions = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "vardef", "primitiveType", "type", "funcdef", "listVariable", 
			"params", "param", "ids", "statement", "cuerpoIter", "cuerpoFunc", "statements", 
			"expr", "function_invocation", "expressions"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "'int'", 
			"'char'", "'double'", "'['", "']'", "'struct'", "','", "'return'", "'while'", 
			"'if'", "'else'", "'print'", "'input'", "'='", "'.'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "WHITESPACE", "COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
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
		public VardefContext vardef;
		public FuncdefContext funcdef;
		public MainContext main;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			List<Definition> defs = new ArrayList<Definition>();
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(41);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(35);
						((ProgramContext)_localctx).vardef = vardef();
						defs.addAll(((ProgramContext)_localctx).vardef.ast);
						}
						break;
					case T__0:
						{
						setState(38);
						((ProgramContext)_localctx).funcdef = funcdef();
						defs.add(((ProgramContext)_localctx).funcdef.ast);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(46);
			((ProgramContext)_localctx).main = main();
			setState(47);
			match(EOF);
			defs.add(((ProgramContext)_localctx).main.ast);
			((ProgramContext)_localctx).ast =  new Program(0, 0, defs);
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

	public static class MainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public Token pri;
		public Token nombre;
		public CuerpoFuncContext cuerpoFunc;
		public CuerpoFuncContext cuerpoFunc() {
			return getRuleContext(CuerpoFuncContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((MainContext)_localctx).pri = match(T__0);
			setState(52);
			((MainContext)_localctx).nombre = match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			match(T__3);
			setState(55);
			match(T__4);
			setState(56);
			match(T__5);
			setState(57);
			((MainContext)_localctx).cuerpoFunc = cuerpoFunc();
			setState(58);
			match(T__6);
			((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).pri.getLine(), ((MainContext)_localctx).pri.getCharPositionInLine()+1,
			        new FunctionType(((MainContext)_localctx).nombre.getLine(), ((MainContext)_localctx).nombre.getCharPositionInLine()+1, new ArrayList<VarDefinition>(), VoidType.getInstance())
			        , "main", ((MainContext)_localctx).cuerpoFunc.ast);
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public IdsContext idm;
		public IdsContext ids;
		public TypeContext type;
		public ListVariableContext list;
		public ListVariableContext listVariable;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdsContext ids() {
			return getRuleContext(IdsContext.class,0);
		}
		public ListVariableContext listVariable() {
			return getRuleContext(ListVariableContext.class,0);
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
		enterRule(_localctx, 4, RULE_vardef);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((VardefContext)_localctx).idm = ((VardefContext)_localctx).ids = ids();
				setState(62);
				match(T__4);
				setState(63);
				((VardefContext)_localctx).type = type();
				setState(64);
				match(T__7);
				 for (String id: ((VardefContext)_localctx).ids.ast){
				           VarDefinition var = new VarDefinition((((VardefContext)_localctx).idm!=null?(((VardefContext)_localctx).idm.start):null).getLine(), (((VardefContext)_localctx).idm!=null?(((VardefContext)_localctx).idm.start):null).getCharPositionInLine()+1, ((VardefContext)_localctx).type.ast, id);
				           if (_localctx.ast.contains(var)){
				                new ErrorType((((VardefContext)_localctx).idm!=null?(((VardefContext)_localctx).idm.start):null).getLine(), (((VardefContext)_localctx).idm!=null?(((VardefContext)_localctx).idm.start):null).getCharPositionInLine()+1,
				                    "Error, la variable " + var.getName() + " ya está definida");
				           }
				           else {
				                _localctx.ast.add(var);
				           }
				       }
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((VardefContext)_localctx).list = ((VardefContext)_localctx).listVariable = listVariable();
				   for (VarDefinition variable: ((VardefContext)_localctx).listVariable.ast){
				            if (_localctx.ast.contains(variable)){
				                new ErrorType((((VardefContext)_localctx).list!=null?(((VardefContext)_localctx).list.start):null).getLine(), (((VardefContext)_localctx).list!=null?(((VardefContext)_localctx).list.start):null).getCharPositionInLine()+1,
				                    "Error, la variable " + variable.getName() + " ya está definida");
				            }
				            else {
				                _localctx.ast.add(variable);
				            }
				        }
				    
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
		public Type ast;
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
		enterRule(_localctx, 6, RULE_primitiveType);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__8);
				((PrimitiveTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__9);
				((PrimitiveTypeContext)_localctx).ast =  CharType.getInstance();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__10);
				((PrimitiveTypeContext)_localctx).ast =  DoubleType.getInstance();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext primitiveType;
		public Token pri;
		public Token INT_CONSTANT;
		public TypeContext type;
		public VardefContext fields;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((TypeContext)_localctx).primitiveType = primitiveType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				((TypeContext)_localctx).pri = match(T__11);
				setState(84);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(85);
				match(T__12);
				setState(86);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new Array(((TypeContext)_localctx).pri.getLine(), ((TypeContext)_localctx).pri.getCharPositionInLine()+1,
				            LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)), ((TypeContext)_localctx).type.ast);
				    
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((TypeContext)_localctx).pri = match(T__13);
				setState(90);
				match(T__5);
				setState(91);
				((TypeContext)_localctx).fields = vardef();
				setState(92);
				match(T__6);
				List<RecordField> recordFields = new ArrayList<RecordField>();
				      for (VarDefinition variable: ((TypeContext)_localctx).fields.ast){
				          RecordField record = new RecordField((((TypeContext)_localctx).fields!=null?(((TypeContext)_localctx).fields.start):null).getLine(), (((TypeContext)_localctx).fields!=null?(((TypeContext)_localctx).fields.start):null).getCharPositionInLine()+1, variable.getName(), variable.getType());
				          if (recordFields.contains(record)){
				              new ErrorType((((TypeContext)_localctx).fields!=null?(((TypeContext)_localctx).fields.start):null).getLine(), (((TypeContext)_localctx).fields!=null?(((TypeContext)_localctx).fields.start):null).getCharPositionInLine()+1,
				                                 "Error, la variable " + variable.getName() + " ya está definida");
				          }
				          else{
				              recordFields.add(record);
				          }
				       }
				      ((TypeContext)_localctx).ast =  new Record(((TypeContext)_localctx).pri.getLine(), ((TypeContext)_localctx).pri.getCharPositionInLine()+1, recordFields);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public FuncDefinition ast;
		public Token pri;
		public Token ID;
		public ParamsContext par;
		public PrimitiveTypeContext primitiveType;
		public CuerpoFuncContext cuerpoFunc;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public CuerpoFuncContext cuerpoFunc() {
			return getRuleContext(CuerpoFuncContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
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
		enterRule(_localctx, 10, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			Type returnType = VoidType.getInstance();
			setState(98);
			((FuncdefContext)_localctx).pri = match(T__0);
			setState(99);
			((FuncdefContext)_localctx).ID = match(ID);
			setState(100);
			((FuncdefContext)_localctx).par = params();
			setState(101);
			match(T__4);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(102);
				((FuncdefContext)_localctx).primitiveType = primitiveType();
				returnType = ((FuncdefContext)_localctx).primitiveType.ast;
				}
			}

			setState(107);
			match(T__5);
			setState(108);
			((FuncdefContext)_localctx).cuerpoFunc = cuerpoFunc();
			setState(109);
			match(T__6);
			((FuncdefContext)_localctx).ast =  new FuncDefinition(((FuncdefContext)_localctx).pri.getLine(), ((FuncdefContext)_localctx).pri.getCharPositionInLine()+1,
			         new FunctionType((((FuncdefContext)_localctx).par!=null?(((FuncdefContext)_localctx).par.start):null).getLine(), (((FuncdefContext)_localctx).par!=null?(((FuncdefContext)_localctx).par.start):null).getCharPositionInLine()+1, ((FuncdefContext)_localctx).par.ast, returnType)
			         , (((FuncdefContext)_localctx).ID!=null?((FuncdefContext)_localctx).ID.getText():null), ((FuncdefContext)_localctx).cuerpoFunc.ast);
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

	public static class ListVariableContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID;
		public TypeContext type;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ListVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitListVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListVariableContext listVariable() throws RecognitionException {
		ListVariableContext _localctx = new ListVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					((ListVariableContext)_localctx).ID = match(ID);
					setState(113);
					match(T__4);
					setState(114);
					((ListVariableContext)_localctx).type = type();
					setState(115);
					match(T__7);
					_localctx.ast.add(new VarDefinition(((ListVariableContext)_localctx).ID.getLine(), ((ListVariableContext)_localctx).ID.getCharPositionInLine()+1, ((ListVariableContext)_localctx).type.ast, (((ListVariableContext)_localctx).ID!=null?((ListVariableContext)_localctx).ID.getText():null)));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public ParamContext id1;
		public ParamContext idm;
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
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__2);
				setState(123);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__2);
				setState(125);
				((ParamsContext)_localctx).id1 = param();
				_localctx.ast.add(((ParamsContext)_localctx).id1.ast);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(127);
					match(T__14);
					setState(128);
					((ParamsContext)_localctx).idm = param();
					_localctx.ast.add(((ParamsContext)_localctx).idm.ast);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__3);
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

	public static class ParamContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token ID;
		public PrimitiveTypeContext primitiveType;
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
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((ParamContext)_localctx).ID = match(ID);
			setState(141);
			match(T__4);
			setState(142);
			((ParamContext)_localctx).primitiveType = primitiveType();
			((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).ID.getLine(), ((ParamContext)_localctx).ID.getCharPositionInLine()+1, ((ParamContext)_localctx).primitiveType.ast, (((ParamContext)_localctx).ID!=null?((ParamContext)_localctx).ID.getText():null));
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

	public static class IdsContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<String>();
		public Token id1;
		public Token idm;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public IdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitIds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsContext ids() throws RecognitionException {
		IdsContext _localctx = new IdsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((IdsContext)_localctx).id1 = match(ID);
			_localctx.ast.add((((IdsContext)_localctx).id1!=null?((IdsContext)_localctx).id1.getText():null));
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(147);
				match(T__14);
				setState(148);
				((IdsContext)_localctx).idm = match(ID);
				_localctx.ast.add((((IdsContext)_localctx).idm!=null?((IdsContext)_localctx).idm.getText():null));
				}
				}
				setState(154);
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public Function_invocationContext function_invocation;
		public Token ret;
		public ExprContext expr;
		public Token whi;
		public CuerpoIterContext cuerpoIter;
		public Token ifp;
		public CuerpoIterContext ifC;
		public Token p;
		public ExpressionsContext expressions;
		public ExprContext ex1;
		public ExprContext ex2;
		public Function_invocationContext function_invocation() {
			return getRuleContext(Function_invocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CuerpoIterContext> cuerpoIter() {
			return getRuleContexts(CuerpoIterContext.class);
		}
		public CuerpoIterContext cuerpoIter(int i) {
			return getRuleContext(CuerpoIterContext.class,i);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
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
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((StatementContext)_localctx).function_invocation = function_invocation();
				setState(156);
				match(T__7);
				_localctx.ast.add(((StatementContext)_localctx).function_invocation.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((StatementContext)_localctx).ret = match(T__15);
				setState(160);
				((StatementContext)_localctx).expr = expr(0);
				setState(161);
				match(T__7);
				_localctx.ast.add(new Return(((StatementContext)_localctx).ret.getLine(), ((StatementContext)_localctx).ret.getCharPositionInLine()+1, ((StatementContext)_localctx).expr.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				((StatementContext)_localctx).whi = match(T__16);
				setState(165);
				((StatementContext)_localctx).expr = expr(0);
				setState(166);
				match(T__4);
				setState(167);
				((StatementContext)_localctx).cuerpoIter = cuerpoIter();
				_localctx.ast.add(new While(((StatementContext)_localctx).whi.getLine(), ((StatementContext)_localctx).whi.getCharPositionInLine()+1, ((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).cuerpoIter.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				List<Statement> elseC = new ArrayList<Statement>();
				setState(171);
				((StatementContext)_localctx).ifp = match(T__17);
				setState(172);
				((StatementContext)_localctx).expr = expr(0);
				setState(173);
				match(T__4);
				setState(174);
				((StatementContext)_localctx).ifC = ((StatementContext)_localctx).cuerpoIter = cuerpoIter();
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(175);
					match(T__18);
					setState(176);
					((StatementContext)_localctx).cuerpoIter = cuerpoIter();
					elseC = ((StatementContext)_localctx).cuerpoIter.ast;
					}
					break;
				}
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).ifp.getLine(), ((StatementContext)_localctx).ifp.getCharPositionInLine()+1, ((StatementContext)_localctx).expr.ast, ((StatementContext)_localctx).ifC.ast, elseC));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				((StatementContext)_localctx).p = match(T__19);
				setState(184);
				((StatementContext)_localctx).expressions = expressions();
				setState(185);
				match(T__7);
				for (Expression exp: ((StatementContext)_localctx).expressions.ast)
				         _localctx.ast.add(new Print(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine()+1, exp));
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				((StatementContext)_localctx).p = match(T__20);
				setState(189);
				((StatementContext)_localctx).expressions = expressions();
				setState(190);
				match(T__7);
				for (Expression exp: ((StatementContext)_localctx).expressions.ast)
				         _localctx.ast.add(new Input(((StatementContext)_localctx).p.getLine(), ((StatementContext)_localctx).p.getCharPositionInLine()+1, exp));
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				((StatementContext)_localctx).ex1 = expr(0);
				setState(194);
				match(T__21);
				setState(195);
				((StatementContext)_localctx).ex2 = expr(0);
				setState(196);
				match(T__7);
				_localctx.ast.add(new Assigment((((StatementContext)_localctx).ex1!=null?(((StatementContext)_localctx).ex1.start):null).getLine(), (((StatementContext)_localctx).ex1!=null?(((StatementContext)_localctx).ex1.start):null).getCharPositionInLine()+1, ((StatementContext)_localctx).ex1.ast, ((StatementContext)_localctx).ex2.ast));
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

	public static class CuerpoIterContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public CuerpoIterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoIter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCuerpoIter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoIterContext cuerpoIter() throws RecognitionException {
		CuerpoIterContext _localctx = new CuerpoIterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cuerpoIter);
		try {
			int _alt;
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__15:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((CuerpoIterContext)_localctx).statement = statement();
				_localctx.ast.addAll(((CuerpoIterContext)_localctx).statement.ast);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__5);
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(205);
						((CuerpoIterContext)_localctx).statements = statements();
						_localctx.ast.addAll(((CuerpoIterContext)_localctx).statements.ast);
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(213);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CuerpoFuncContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public VardefContext vardef;
		public StatementsContext statements;
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public CuerpoFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitCuerpoFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoFuncContext cuerpoFunc() throws RecognitionException {
		CuerpoFuncContext _localctx = new CuerpoFuncContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cuerpoFunc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					((CuerpoFuncContext)_localctx).vardef = vardef();
					_localctx.ast.addAll(((CuerpoFuncContext)_localctx).vardef.ast);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(224);
				((CuerpoFuncContext)_localctx).statements = statements();
				_localctx.ast.addAll(((CuerpoFuncContext)_localctx).statements.ast);
				}
				}
				setState(231);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(232);
					((StatementsContext)_localctx).statement = statement();
					_localctx.ast.addAll(((StatementsContext)_localctx).statement.ast);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(237); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Expression ast;
		public ExprContext ex1;
		public ExprContext exp1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public ExprContext expr;
		public Token pri;
		public PrimitiveTypeContext primitiveType;
		public Function_invocationContext function_invocation;
		public Token op;
		public ExprContext exp2;
		public ExprContext ex2;
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(240);
				((ExprContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExprContext)_localctx).ast =  new IntLiteral(((ExprContext)_localctx).INT_CONSTANT.getLine(), ((ExprContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				        LexerHelper.lexemeToInt((((ExprContext)_localctx).INT_CONSTANT!=null?((ExprContext)_localctx).INT_CONSTANT.getText():null)));
				    
				}
				break;
			case 2:
				{
				setState(242);
				((ExprContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExprContext)_localctx).ast =  new DoubleLiteral(((ExprContext)_localctx).REAL_CONSTANT.getLine(), ((ExprContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				        LexerHelper.lexemeToReal((((ExprContext)_localctx).REAL_CONSTANT!=null?((ExprContext)_localctx).REAL_CONSTANT.getText():null)));
				    
				}
				break;
			case 3:
				{
				setState(244);
				((ExprContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExprContext)_localctx).ast =  new CharLiteral(((ExprContext)_localctx).CHAR_CONSTANT.getLine(), ((ExprContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				        LexerHelper.lexemeToChar((((ExprContext)_localctx).CHAR_CONSTANT!=null?((ExprContext)_localctx).CHAR_CONSTANT.getText():null)));
				    
				}
				break;
			case 4:
				{
				setState(246);
				((ExprContext)_localctx).ID = match(ID);
				((ExprContext)_localctx).ast =  new Variable(((ExprContext)_localctx).ID.getLine(), ((ExprContext)_localctx).ID.getCharPositionInLine()+1, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(248);
				match(T__2);
				setState(249);
				((ExprContext)_localctx).expr = expr(0);
				setState(250);
				match(T__3);
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).expr.ast;
				}
				break;
			case 6:
				{
				setState(253);
				((ExprContext)_localctx).pri = match(T__2);
				setState(254);
				((ExprContext)_localctx).primitiveType = primitiveType();
				setState(255);
				match(T__3);
				setState(256);
				((ExprContext)_localctx).expr = expr(8);
				((ExprContext)_localctx).ast =  new Cast(((ExprContext)_localctx).pri.getLine(), ((ExprContext)_localctx).pri.getCharPositionInLine()+1, ((ExprContext)_localctx).primitiveType.ast, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 7:
				{
				setState(259);
				((ExprContext)_localctx).pri = match(T__23);
				setState(260);
				((ExprContext)_localctx).expr = expr(7);
				((ExprContext)_localctx).ast =  new UnaryMinus(((ExprContext)_localctx).pri.getLine(), ((ExprContext)_localctx).pri.getCharPositionInLine()+1, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 8:
				{
				setState(263);
				((ExprContext)_localctx).pri = match(T__24);
				setState(264);
				((ExprContext)_localctx).expr = expr(6);
				((ExprContext)_localctx).ast =  new Negation(((ExprContext)_localctx).pri.getLine(), ((ExprContext)_localctx).pri.getCharPositionInLine()+1, ((ExprContext)_localctx).expr.ast);
				}
				break;
			case 9:
				{
				setState(267);
				((ExprContext)_localctx).function_invocation = function_invocation();
				((ExprContext)_localctx).ast =  ((ExprContext)_localctx).function_invocation.ast;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(272);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(273);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						((ExprContext)_localctx).exp2 = ((ExprContext)_localctx).expr = expr(6);
						((ExprContext)_localctx).ast =  new Arithmetic((((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getLine(), (((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).exp1.ast, ((ExprContext)_localctx).exp2.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(278);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(279);
						((ExprContext)_localctx).exp2 = ((ExprContext)_localctx).expr = expr(5);
						((ExprContext)_localctx).ast =  new Arithmetic((((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getLine(), (((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).exp1.ast, ((ExprContext)_localctx).exp2.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(283);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						((ExprContext)_localctx).exp2 = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).ast =  new Comparison((((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getLine(), (((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).exp1.ast, ((ExprContext)_localctx).exp2.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(288);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						((ExprContext)_localctx).exp2 = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).ast =  new Logical((((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getLine(), (((ExprContext)_localctx).exp1!=null?(((ExprContext)_localctx).exp1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).exp1.ast, ((ExprContext)_localctx).exp2.ast, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(293);
						match(T__11);
						setState(294);
						((ExprContext)_localctx).ex2 = ((ExprContext)_localctx).expr = expr(0);
						setState(295);
						match(T__12);
						((ExprContext)_localctx).ast =  new ArrayAccess((((ExprContext)_localctx).ex1!=null?(((ExprContext)_localctx).ex1.start):null).getLine(), (((ExprContext)_localctx).ex2!=null?(((ExprContext)_localctx).ex2.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).ex1.ast, ((ExprContext)_localctx).ex2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.ex1 = _prevctx;
						_localctx.ex1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(299);
						match(T__22);
						setState(300);
						((ExprContext)_localctx).ID = match(ID);
						((ExprContext)_localctx).ast =  new RecordAccess((((ExprContext)_localctx).ex1!=null?(((ExprContext)_localctx).ex1.start):null).getLine(), (((ExprContext)_localctx).ex1!=null?(((ExprContext)_localctx).ex1.start):null).getCharPositionInLine()+1, ((ExprContext)_localctx).ex1.ast, (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public FunctionInvocation ast;
		public Token ID;
		public ExpressionsContext expressions;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
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
		enterRule(_localctx, 30, RULE_function_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expression> expresiones = new ArrayList<Expression>();
			setState(308);
			((Function_invocationContext)_localctx).ID = match(ID);
			setState(309);
			match(T__2);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << INT_CONSTANT) | (1L << REAL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(310);
				((Function_invocationContext)_localctx).expressions = expressions();
				expresiones = ((Function_invocationContext)_localctx).expressions.ast;
				}
			}

			setState(315);
			match(T__3);
			((Function_invocationContext)_localctx).ast =  new FunctionInvocation(((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1, expresiones,
			            new Variable(((Function_invocationContext)_localctx).ID.getLine(), ((Function_invocationContext)_localctx).ID.getCharPositionInLine()+1, (((Function_invocationContext)_localctx).ID!=null?((Function_invocationContext)_localctx).ID.getText():null)));
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExprContext ex1;
		public ExprContext exm;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((ExpressionsContext)_localctx).ex1 = expr(0);
			_localctx.ast.add(((ExpressionsContext)_localctx).ex1.ast);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(320);
				match(T__14);
				setState(321);
				((ExpressionsContext)_localctx).exm = expr(0);
				_localctx.ast.add(((ExpressionsContext)_localctx).exm.ast);
				}
				}
				setState(328);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"y\n\b\r\b\16\bz\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0086\n\t\f\t"+
		"\16\t\u0089\13\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0099\n\13\f\13\16\13\u009c\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u00d3\n\r\f\r\16\r\u00d6\13\r\3\r\5\r\u00d9\n\r\3\16\3\16\3\16\7\16\u00de"+
		"\n\16\f\16\16\16\u00e1\13\16\3\16\3\16\3\16\7\16\u00e6\n\16\f\16\16\16"+
		"\u00e9\13\16\3\17\3\17\3\17\6\17\u00ee\n\17\r\17\16\17\u00ef\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0111\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0131\n\20\f\20\16\20\u0134\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013c\n\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0147\n\22\f\22\16\22\u014a\13\22\3\22\3\u00d4"+
		"\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2\34\36\4\2\32"+
		"\32\37\37\3\2 %\3\2&\'\2\u0162\2$\3\2\2\2\4\65\3\2\2\2\6H\3\2\2\2\bP\3"+
		"\2\2\2\na\3\2\2\2\fc\3\2\2\2\16x\3\2\2\2\20\u008c\3\2\2\2\22\u008e\3\2"+
		"\2\2\24\u0093\3\2\2\2\26\u00c9\3\2\2\2\30\u00d8\3\2\2\2\32\u00df\3\2\2"+
		"\2\34\u00ed\3\2\2\2\36\u0110\3\2\2\2 \u0135\3\2\2\2\"\u0140\3\2\2\2$-"+
		"\b\2\1\2%&\5\6\4\2&\'\b\2\1\2\',\3\2\2\2()\5\f\7\2)*\b\2\1\2*,\3\2\2\2"+
		"+%\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2"+
		"\2\60\61\5\4\3\2\61\62\7\2\2\3\62\63\b\2\1\2\63\64\b\2\1\2\64\3\3\2\2"+
		"\2\65\66\7\3\2\2\66\67\7\4\2\2\678\7\5\2\289\7\6\2\29:\7\7\2\2:;\7\b\2"+
		"\2;<\5\32\16\2<=\7\t\2\2=>\b\3\1\2>\5\3\2\2\2?@\5\24\13\2@A\7\7\2\2AB"+
		"\5\n\6\2BC\7\n\2\2CD\b\4\1\2DI\3\2\2\2EF\5\16\b\2FG\b\4\1\2GI\3\2\2\2"+
		"H?\3\2\2\2HE\3\2\2\2I\7\3\2\2\2JK\7\13\2\2KQ\b\5\1\2LM\7\f\2\2MQ\b\5\1"+
		"\2NO\7\r\2\2OQ\b\5\1\2PJ\3\2\2\2PL\3\2\2\2PN\3\2\2\2Q\t\3\2\2\2RS\5\b"+
		"\5\2ST\b\6\1\2Tb\3\2\2\2UV\7\16\2\2VW\7*\2\2WX\7\17\2\2XY\5\n\6\2YZ\b"+
		"\6\1\2Zb\3\2\2\2[\\\7\20\2\2\\]\7\b\2\2]^\5\6\4\2^_\7\t\2\2_`\b\6\1\2"+
		"`b\3\2\2\2aR\3\2\2\2aU\3\2\2\2a[\3\2\2\2b\13\3\2\2\2cd\b\7\1\2de\7\3\2"+
		"\2ef\7-\2\2fg\5\20\t\2gk\7\7\2\2hi\5\b\5\2ij\b\7\1\2jl\3\2\2\2kh\3\2\2"+
		"\2kl\3\2\2\2lm\3\2\2\2mn\7\b\2\2no\5\32\16\2op\7\t\2\2pq\b\7\1\2q\r\3"+
		"\2\2\2rs\7-\2\2st\7\7\2\2tu\5\n\6\2uv\7\n\2\2vw\b\b\1\2wy\3\2\2\2xr\3"+
		"\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|}\7\5\2\2}\u008d\7\6"+
		"\2\2~\177\7\5\2\2\177\u0080\5\22\n\2\u0080\u0087\b\t\1\2\u0081\u0082\7"+
		"\21\2\2\u0082\u0083\5\22\n\2\u0083\u0084\b\t\1\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\6\2\2\u008b"+
		"\u008d\3\2\2\2\u008c|\3\2\2\2\u008c~\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f"+
		"\7-\2\2\u008f\u0090\7\7\2\2\u0090\u0091\5\b\5\2\u0091\u0092\b\n\1\2\u0092"+
		"\23\3\2\2\2\u0093\u0094\7-\2\2\u0094\u009a\b\13\1\2\u0095\u0096\7\21\2"+
		"\2\u0096\u0097\7-\2\2\u0097\u0099\b\13\1\2\u0098\u0095\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\n\2\2\u009f\u00a0\b\f"+
		"\1\2\u00a0\u00ca\3\2\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3\5\36\20\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\b\f\1\2\u00a5\u00ca\3\2\2\2\u00a6\u00a7\7\23"+
		"\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\5\30\r\2\u00aa"+
		"\u00ab\b\f\1\2\u00ab\u00ca\3\2\2\2\u00ac\u00ad\b\f\1\2\u00ad\u00ae\7\24"+
		"\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0\7\7\2\2\u00b0\u00b5\5\30\r\2\u00b1"+
		"\u00b2\7\25\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\b\f\1\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\b\f\1\2\u00b8\u00ca\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5"+
		"\"\22\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\b\f\1\2\u00bd\u00ca\3\2\2\2\u00be"+
		"\u00bf\7\27\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\b"+
		"\f\1\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5\7\30\2\2"+
		"\u00c5\u00c6\5\36\20\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\b\f\1\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u009d\3\2\2\2\u00c9\u00a1\3\2\2\2\u00c9\u00a6\3\2\2\2\u00c9"+
		"\u00ac\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00ca\27\3\2\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\b\r\1\2\u00cd\u00d9"+
		"\3\2\2\2\u00ce\u00d4\7\b\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\b\r\1\2"+
		"\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\7\t\2\2\u00d8\u00cb\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d9\31\3\2\2"+
		"\2\u00da\u00db\5\6\4\2\u00db\u00dc\b\16\1\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\5\34\17\2\u00e3"+
		"\u00e4\b\16\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3"+
		"\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\33\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\5\26\f\2\u00eb\u00ec\b\17\1\2\u00ec\u00ee\3"+
		"\2\2\2\u00ed\u00ea\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\35\3\2\2\2\u00f1\u00f2\b\20\1\2\u00f2\u00f3\7*\2"+
		"\2\u00f3\u0111\b\20\1\2\u00f4\u00f5\7+\2\2\u00f5\u0111\b\20\1\2\u00f6"+
		"\u00f7\7,\2\2\u00f7\u0111\b\20\1\2\u00f8\u00f9\7-\2\2\u00f9\u0111\b\20"+
		"\1\2\u00fa\u00fb\7\5\2\2\u00fb\u00fc\5\36\20\2\u00fc\u00fd\7\6\2\2\u00fd"+
		"\u00fe\b\20\1\2\u00fe\u0111\3\2\2\2\u00ff\u0100\7\5\2\2\u0100\u0101\5"+
		"\b\5\2\u0101\u0102\7\6\2\2\u0102\u0103\5\36\20\n\u0103\u0104\b\20\1\2"+
		"\u0104\u0111\3\2\2\2\u0105\u0106\7\32\2\2\u0106\u0107\5\36\20\t\u0107"+
		"\u0108\b\20\1\2\u0108\u0111\3\2\2\2\u0109\u010a\7\33\2\2\u010a\u010b\5"+
		"\36\20\b\u010b\u010c\b\20\1\2\u010c\u0111\3\2\2\2\u010d\u010e\5 \21\2"+
		"\u010e\u010f\b\20\1\2\u010f\u0111\3\2\2\2\u0110\u00f1\3\2\2\2\u0110\u00f4"+
		"\3\2\2\2\u0110\u00f6\3\2\2\2\u0110\u00f8\3\2\2\2\u0110\u00fa\3\2\2\2\u0110"+
		"\u00ff\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0132\3\2\2\2\u0112\u0113\f\7\2\2\u0113\u0114\t\2\2\2\u0114"+
		"\u0115\5\36\20\b\u0115\u0116\b\20\1\2\u0116\u0131\3\2\2\2\u0117\u0118"+
		"\f\6\2\2\u0118\u0119\t\3\2\2\u0119\u011a\5\36\20\7\u011a\u011b\b\20\1"+
		"\2\u011b\u0131\3\2\2\2\u011c\u011d\f\5\2\2\u011d\u011e\t\4\2\2\u011e\u011f"+
		"\5\36\20\6\u011f\u0120\b\20\1\2\u0120\u0131\3\2\2\2\u0121\u0122\f\4\2"+
		"\2\u0122\u0123\t\5\2\2\u0123\u0124\5\36\20\5\u0124\u0125\b\20\1\2\u0125"+
		"\u0131\3\2\2\2\u0126\u0127\f\f\2\2\u0127\u0128\7\16\2\2\u0128\u0129\5"+
		"\36\20\2\u0129\u012a\7\17\2\2\u012a\u012b\b\20\1\2\u012b\u0131\3\2\2\2"+
		"\u012c\u012d\f\13\2\2\u012d\u012e\7\31\2\2\u012e\u012f\7-\2\2\u012f\u0131"+
		"\b\20\1\2\u0130\u0112\3\2\2\2\u0130\u0117\3\2\2\2\u0130\u011c\3\2\2\2"+
		"\u0130\u0121\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u012c\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\37\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\b\21\1\2\u0136\u0137\7-\2\2\u0137\u013b\7\5"+
		"\2\2\u0138\u0139\5\"\22\2\u0139\u013a\b\21\1\2\u013a\u013c\3\2\2\2\u013b"+
		"\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\6"+
		"\2\2\u013e\u013f\b\21\1\2\u013f!\3\2\2\2\u0140\u0141\5\36\20\2\u0141\u0148"+
		"\b\22\1\2\u0142\u0143\7\21\2\2\u0143\u0144\5\36\20\2\u0144\u0145\b\22"+
		"\1\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149#\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\30+-HPakz\u0087\u008c\u009a\u00b5\u00c9\u00d4\u00d8\u00df\u00e7\u00ef"+
		"\u0110\u0130\u0132\u013b\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}