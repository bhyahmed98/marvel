import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { ProcessHTTPMsgService } from '../process-httpmsg.service';
import { character } from '../shared/character';

const baseUrl = 'http://localhost:8080/'

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private http: HttpClient,private processHTTPMsgService:ProcessHTTPMsgService) { }

  getcharacter():Observable<Array<character>>{
    return this.http.post<Array<character>>(baseUrl+'/getall',[])
    .pipe(catchError(this.processHTTPMsgService.handleError));
  }


}
