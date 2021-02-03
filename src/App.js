import React, { useState } from "react";
import './App.css';

import SyntaxHighlighter from 'react-syntax-highlighter';
import { docco } from 'react-syntax-highlighter/dist/esm/styles/hljs';

export default function App() {
  const [editorLanguage, setEditorLanguage] = useState("javascript");

  const codeString = `
  <xml>
  
  `;

  return (
    <div>
      <input
          type="radio"
          id="javascript"
          name="language"
          value="javascript"
          checked={editorLanguage === "javascript"}
          onChange={() => setEditorLanguage("javascript")}
        />
        <label htmlFor="javascript">JavaScript</label>
        <input
          type="radio"
          id="java"
          name="language"
          value="java"
          checked={editorLanguage === "java"}
          onChange={() => setEditorLanguage("java")}
        />
        <label htmlFor="java">Java</label>
        <input
          type="radio"
          id="xml"
          name="language"
          value="markup"
          checked={editorLanguage === "markup"}
          onChange={() => setEditorLanguage("markup")}
        />
        <label htmlFor="xml">XML</label>
      <SyntaxHighlighter language={editorLanguage} style={docco}>
        {codeString}
      </SyntaxHighlighter>
    </div>
  );
}
