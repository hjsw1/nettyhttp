/*
  MIT License
  <p>
  Copyright (c) 2017 Michael Yan
  <p>
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  <p>
  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.
  <p>
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  SOFTWARE.
 */
package basic;

import org.nettymvc.annotation.Action;
import org.nettymvc.annotation.RequestMethod;
import org.nettymvc.annotation.Router;
import org.nettymvc.data.RequestParam;
import org.nettymvc.data.response.JsonResponse;
import org.nettymvc.data.response.NettyResponse;

import java.util.Date;

/**
 * Created by myan on 12/5/2017.
 * Intellij IDEA
 */
@Router
public class BasicRouter {
    
    @Action(value = "/act", method = {RequestMethod.GET})
    public NettyResponse act(RequestParam param) {
        NettyResponse response = new JsonResponse();
        response.put("date", new Date());
        response.put("name", "Michael Yan");
        System.out.println("Query params:" + param.getInt("id"));
        return response;
    }
    
    @Action(value="/post", method = {RequestMethod.POST})
    public NettyResponse testPost(RequestParam param) {
        NettyResponse response = new JsonResponse();
        response.put("param", param);
        response.put("date", new Date().toString());
        return response;
    }
}
