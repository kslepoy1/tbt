import { TestBed } from '@angular/core/testing';

import { CurrUserService } from './curr-user.service';

describe('CurrUserService', () => {
  let service: CurrUserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CurrUserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
