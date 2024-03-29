// Generated from /home/sergio/Documents/Projects/Learning/Antlr/MongoQL/src/com/mongoql/MongoQL.g4 by ANTLR 4.7.2
package com.mongoql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MongoQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, RELOP=15, NUMBER=16, 
		BOOLEAN=17, STRING=18, ID=19, CHARACTER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "RELOP", "NUMBER", "BOOLEAN", 
			"STRING", "ID", "CHARACTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'SELECT'", "'*'", "','", "'.'", "'FROM'", "'WHERE'", "'('", 
			"')'", "'AND'", "'OR'", "'ORDER BY'", "'ASC'", "'DESC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "RELOP", "NUMBER", "BOOLEAN", "STRING", "ID", "CHARACTER", 
			"WS"
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


	public MongoQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MongoQL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20n\n\20\3\21\6\21q\n"+
		"\21\r\21\16\21r\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22~\n\22"+
		"\3\23\3\23\6\23\u0082\n\23\r\23\16\23\u0083\3\23\3\23\3\23\6\23\u0089"+
		"\n\23\r\23\16\23\u008a\3\23\5\23\u008e\n\23\3\24\3\24\7\24\u0092\n\24"+
		"\f\24\16\24\u0095\13\24\3\25\3\25\3\26\6\26\u009a\n\26\r\26\16\26\u009b"+
		"\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\3\2\62;\6\2\62;C"+
		"\\aac|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13"+
		":\3\2\2\2\r<\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27"+
		"O\3\2\2\2\31R\3\2\2\2\33[\3\2\2\2\35_\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#}"+
		"\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0096\3\2\2\2+\u0099\3\2\2\2"+
		"-.\7=\2\2.\4\3\2\2\2/\60\7U\2\2\60\61\7G\2\2\61\62\7N\2\2\62\63\7G\2\2"+
		"\63\64\7E\2\2\64\65\7V\2\2\65\6\3\2\2\2\66\67\7,\2\2\67\b\3\2\2\289\7"+
		".\2\29\n\3\2\2\2:;\7\60\2\2;\f\3\2\2\2<=\7H\2\2=>\7T\2\2>?\7Q\2\2?@\7"+
		"O\2\2@\16\3\2\2\2AB\7Y\2\2BC\7J\2\2CD\7G\2\2DE\7T\2\2EF\7G\2\2F\20\3\2"+
		"\2\2GH\7*\2\2H\22\3\2\2\2IJ\7+\2\2J\24\3\2\2\2KL\7C\2\2LM\7P\2\2MN\7F"+
		"\2\2N\26\3\2\2\2OP\7Q\2\2PQ\7T\2\2Q\30\3\2\2\2RS\7Q\2\2ST\7T\2\2TU\7F"+
		"\2\2UV\7G\2\2VW\7T\2\2WX\7\"\2\2XY\7D\2\2YZ\7[\2\2Z\32\3\2\2\2[\\\7C\2"+
		"\2\\]\7U\2\2]^\7E\2\2^\34\3\2\2\2_`\7F\2\2`a\7G\2\2ab\7U\2\2bc\7E\2\2"+
		"c\36\3\2\2\2dn\7?\2\2ef\7#\2\2fn\7?\2\2gn\7>\2\2hi\7>\2\2in\7?\2\2jn\7"+
		"@\2\2kl\7@\2\2ln\7?\2\2md\3\2\2\2me\3\2\2\2mg\3\2\2\2mh\3\2\2\2mj\3\2"+
		"\2\2mk\3\2\2\2n \3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\"\3\2\2\2tu\7V\2\2uv\7T\2\2vw\7W\2\2w~\7G\2\2xy\7H\2\2yz\7C\2\2"+
		"z{\7N\2\2{|\7U\2\2|~\7G\2\2}t\3\2\2\2}x\3\2\2\2~$\3\2\2\2\177\u0081\7"+
		"$\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008e\7$"+
		"\2\2\u0086\u0088\7)\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\7)\2\2\u008d\177\3\2\2\2\u008d\u0086\3\2\2\2\u008e&\3"+
		"\2\2\2\u008f\u0093\t\4\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094(\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0096\u0097\t\3\2\2\u0097*\3\2\2\2\u0098\u009a\t"+
		"\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\26\2\2\u009e,\3\2\2\2"+
		"\13\2mr}\u0083\u008a\u008d\u0093\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}