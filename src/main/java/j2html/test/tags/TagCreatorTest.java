package j2html.test.tags;

import org.junit.Test;

import static j2html.src.tags.TagCreator.*;
import static junit.framework.Assert.assertTrue;

public class TagCreatorTest {

    @Test
    public void testAllTags() throws Exception {
        //yea, this is generated from http://www.w3schools.com/tags/

        //Special Tags

        assertTrue(tag("tagname").render().equals("<tagname></tagname>"));
        assertTrue(emptyTag("tagname").render().equals("<tagname>"));
        assertTrue(text("<script>").render().equals("&#60;script&#62;"));
        assertTrue(unsafeHtml("<script>").render().equals("<script>"));
        assertTrue(text("text").render().equals("text"));

        //EmptyTags
        assertTrue(document().render().equals("<!DOCTYPE html>"));
        assertTrue(area().render().equals("<area>"));
        assertTrue(base().render().equals("<base>"));
        assertTrue(br().render().equals("<br>"));
        assertTrue(col().render().equals("<col>"));
        assertTrue(embed().render().equals("<embed>"));
        assertTrue(hr().render().equals("<hr>"));
        assertTrue(img().render().equals("<img>"));
        assertTrue(input().render().equals("<input>"));
        assertTrue(keygen().render().equals("<keygen>"));
        assertTrue(link().render().equals("<link>"));
        assertTrue(meta().render().equals("<meta>"));
        assertTrue(param().render().equals("<param>"));
        assertTrue(source().render().equals("<source>"));
        assertTrue(track().render().equals("<track>"));
        assertTrue(wbr().render().equals("<wbr>"));

        //ContainerTags
        assertTrue(a().render().equals("<a></a>"));
        assertTrue(a("Text").render().equals("<a>Text</a>"));
        assertTrue(abbr().render().equals("<abbr></abbr>"));
        assertTrue(address().render().equals("<address></address>"));
        assertTrue(article().render().equals("<article></article>"));
        assertTrue(aside().render().equals("<aside></aside>"));
        assertTrue(audio().render().equals("<audio></audio>"));
        assertTrue(b().render().equals("<b></b>"));
        assertTrue(b("Text").render().equals("<b>Text</b>"));
        assertTrue(bdi().render().equals("<bdi></bdi>"));
        assertTrue(bdi("Text").render().equals("<bdi>Text</bdi>"));
        assertTrue(bdo().render().equals("<bdo></bdo>"));
        assertTrue(bdo("Text").render().equals("<bdo>Text</bdo>"));
        assertTrue(blockquote().render().equals("<blockquote></blockquote>"));
        assertTrue(blockquote("Text").render().equals("<blockquote>Text</blockquote>"));
        assertTrue(body().render().equals("<body></body>"));
        assertTrue(button().render().equals("<button></button>"));
        assertTrue(button("Text").render().equals("<button>Text</button>"));
        assertTrue(canvas().render().equals("<canvas></canvas>"));
        assertTrue(caption().render().equals("<caption></caption>"));
        assertTrue(caption("Text").render().equals("<caption>Text</caption>"));
        assertTrue(cite().render().equals("<cite></cite>"));
        assertTrue(cite("Text").render().equals("<cite>Text</cite>"));
        assertTrue(code().render().equals("<code></code>"));
        assertTrue(colgroup().render().equals("<colgroup></colgroup>"));
        assertTrue(datalist().render().equals("<datalist></datalist>"));
        assertTrue(dd().render().equals("<dd></dd>"));
        assertTrue(dd("Text").render().equals("<dd>Text</dd>"));
        assertTrue(del().render().equals("<del></del>"));
        assertTrue(del("Text").render().equals("<del>Text</del>"));
        assertTrue(details().render().equals("<details></details>"));
        assertTrue(dfn().render().equals("<dfn></dfn>"));
        assertTrue(dfn("Text").render().equals("<dfn>Text</dfn>"));
        assertTrue(dialog().render().equals("<dialog></dialog>"));
        assertTrue(dialog("Text").render().equals("<dialog>Text</dialog>"));
        assertTrue(div().render().equals("<div></div>"));
        assertTrue(dl().render().equals("<dl></dl>"));
        assertTrue(dt().render().equals("<dt></dt>"));
        assertTrue(dt("Text").render().equals("<dt>Text</dt>"));
        assertTrue(em().render().equals("<em></em>"));
        assertTrue(em("Text").render().equals("<em>Text</em>"));
        assertTrue(fieldset().render().equals("<fieldset></fieldset>"));
        assertTrue(figcaption().render().equals("<figcaption></figcaption>"));
        assertTrue(figcaption("Text").render().equals("<figcaption>Text</figcaption>"));
        assertTrue(figure().render().equals("<figure></figure>"));
        assertTrue(footer().render().equals("<footer></footer>"));
        assertTrue(form().render().equals("<form></form>"));
        assertTrue(h1().render().equals("<h1></h1>"));
        assertTrue(h1("Text").render().equals("<h1>Text</h1>"));
        assertTrue(h2().render().equals("<h2></h2>"));
        assertTrue(h2("Text").render().equals("<h2>Text</h2>"));
        assertTrue(h3().render().equals("<h3></h3>"));
        assertTrue(h3("Text").render().equals("<h3>Text</h3>"));
        assertTrue(h4().render().equals("<h4></h4>"));
        assertTrue(h4("Text").render().equals("<h4>Text</h4>"));
        assertTrue(h5().render().equals("<h5></h5>"));
        assertTrue(h5("Text").render().equals("<h5>Text</h5>"));
        assertTrue(h6().render().equals("<h6></h6>"));
        assertTrue(h6("Text").render().equals("<h6>Text</h6>"));
        assertTrue(head().render().equals("<head></head>"));
        assertTrue(header().render().equals("<header></header>"));
        assertTrue(html().render().equals("<html></html>"));
        assertTrue(i().render().equals("<i></i>"));
        assertTrue(i("Text").render().equals("<i>Text</i>"));
        assertTrue(iframe().render().equals("<iframe></iframe>"));
        assertTrue(ins().render().equals("<ins></ins>"));
        assertTrue(ins("Text").render().equals("<ins>Text</ins>"));
        assertTrue(kbd().render().equals("<kbd></kbd>"));
        assertTrue(label().render().equals("<label></label>"));
        assertTrue(label("Text").render().equals("<label>Text</label>"));
        assertTrue(legend().render().equals("<legend></legend>"));
        assertTrue(legend("Text").render().equals("<legend>Text</legend>"));
        assertTrue(li().render().equals("<li></li>"));
        assertTrue(li("Text").render().equals("<li>Text</li>"));
        assertTrue(main().render().equals("<main></main>"));
        assertTrue(map().render().equals("<map></map>"));
        assertTrue(mark().render().equals("<mark></mark>"));
        assertTrue(menu().render().equals("<menu></menu>"));
        assertTrue(menuitem().render().equals("<menuitem></menuitem>"));
        assertTrue(meter().render().equals("<meter></meter>"));
        assertTrue(nav().render().equals("<nav></nav>"));
        assertTrue(noscript().render().equals("<noscript></noscript>"));
        assertTrue(object().render().equals("<object></object>"));
        assertTrue(ol().render().equals("<ol></ol>"));
        assertTrue(optgroup().render().equals("<optgroup></optgroup>"));
        assertTrue(option().render().equals("<option></option>"));
        assertTrue(option("Text").render().equals("<option>Text</option>"));
        assertTrue(output().render().equals("<output></output>"));
        assertTrue(p().render().equals("<p></p>"));
        assertTrue(p("Text").render().equals("<p>Text</p>"));
        assertTrue(pre().render().equals("<pre></pre>"));
        assertTrue(progress().render().equals("<progress></progress>"));
        assertTrue(q().render().equals("<q></q>"));
        assertTrue(q("Text").render().equals("<q>Text</q>"));
        assertTrue(rp().render().equals("<rp></rp>"));
        assertTrue(rt().render().equals("<rt></rt>"));
        assertTrue(ruby().render().equals("<ruby></ruby>"));
        assertTrue(s().render().equals("<s></s>"));
        assertTrue(samp().render().equals("<samp></samp>"));
        assertTrue(script().render().equals("<script></script>"));
        assertTrue(section().render().equals("<section></section>"));
        assertTrue(select().render().equals("<select></select>"));
        assertTrue(small().render().equals("<small></small>"));
        assertTrue(small("Text").render().equals("<small>Text</small>"));
        assertTrue(span().render().equals("<span></span>"));
        assertTrue(span("Text").render().equals("<span>Text</span>"));
        assertTrue(strong().render().equals("<strong></strong>"));
        assertTrue(strong("Text").render().equals("<strong>Text</strong>"));
        assertTrue(style().render().equals("<style></style>"));
        assertTrue(sub().render().equals("<sub></sub>"));
        assertTrue(sub("Text").render().equals("<sub>Text</sub>"));
        assertTrue(summary().render().equals("<summary></summary>"));
        assertTrue(summary("Text").render().equals("<summary>Text</summary>"));
        assertTrue(sup().render().equals("<sup></sup>"));
        assertTrue(sup("Text").render().equals("<sup>Text</sup>"));
        assertTrue(table().render().equals("<table></table>"));
        assertTrue(tbody().render().equals("<tbody></tbody>"));
        assertTrue(td().render().equals("<td></td>"));
        assertTrue(td("Text").render().equals("<td>Text</td>"));
        assertTrue(textarea().render().equals("<textarea></textarea>"));
        assertTrue(tfoot().render().equals("<tfoot></tfoot>"));
        assertTrue(th().render().equals("<th></th>"));
        assertTrue(th("Text").render().equals("<th>Text</th>"));
        assertTrue(thead().render().equals("<thead></thead>"));
        assertTrue(time().render().equals("<time></time>"));
        assertTrue(title().render().equals("<title></title>"));
        assertTrue(tr().render().equals("<tr></tr>"));
        assertTrue(u().render().equals("<u></u>"));
        assertTrue(u("Text").render().equals("<u>Text</u>"));
        assertTrue(ul().render().equals("<ul></ul>"));
        assertTrue(var().render().equals("<var></var>"));
        assertTrue(video().render().equals("<video></video>"));
    }

}